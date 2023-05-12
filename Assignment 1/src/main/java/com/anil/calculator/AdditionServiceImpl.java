package com.anil.calculator;

import org.springframework.stereotype.Service;

/**
 * @author Anil Narlapally
 * @version JAVA 17
 * @since 5/12/2023
 */

@Service
public class AdditionServiceImpl implements AdditionService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
