package com.string;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static  org.mockito.Mockito.*;


public class CalculatorTest {

    Calculator c = null;

    @Mock
    CalculatorService service = Mockito.mock(CalculatorService.class);

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Before
    public void setUp() {
        c = new Calculator(service);
    }

    @Test
    public void testPerform() {
        when(service.add(2,3)).thenReturn(5);
        assertEquals(10, c.perform(2,3));
        verify(service).add(2,3);
    }
}
