package com.chianing.demo.mockdemo.service;

import com.chianing.demo.mockdemo.util.CheckEmptyUtil;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import java.util.Collections;
import java.util.List;

/**
 * @author chianing
 * @description TODO
 * @date 2024/06/19 14:54
 */
@Slf4j
public class BaseService {
    protected <T> void copyProperties(Object source, T target) {
        if (CheckEmptyUtil.isEmpty(source) || CheckEmptyUtil.isEmpty(target)) {
            return;
        }
        BeanUtils.copyProperties(source, target);
    }

    protected <T> T copyProperties(Object source, Class<T> targetClazz) {
        if (CheckEmptyUtil.isEmpty(source) || CheckEmptyUtil.isEmpty(targetClazz)) {
            return null;
        }

        T result = newInstance(targetClazz);
        copyProperties(source, result);

        return result;

    }

    protected <T> List<T> copyProperties(List<?> sourceList, Class<T> targetClazz) {
        if (CheckEmptyUtil.isEmpty(sourceList) || CheckEmptyUtil.isEmpty(targetClazz)) {
            return Collections.emptyList();
        }

        List<T> resultList = Lists.newArrayList();
        for (Object obj : sourceList) {
            resultList.add(copyProperties(obj, targetClazz));
        }

        return resultList;

    }

    private <T> T newInstance(Class<T> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            log.error("newInstance Exception, targetClass: {}", clazz.getName(), e);
            throw new RuntimeException(e.getMessage());
        }
    }

}
