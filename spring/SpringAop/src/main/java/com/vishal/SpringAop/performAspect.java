package com.vishal.SpringAop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class performAspect {

	@Pointcut("execution(* AddingOperation.*(..))")
    public void time_pointcut(){}
	
	@Around("time_pointcut()")  
    public Object myadvice(ProceedingJoinPoint pjp) throws Throwable   
    {  
		long startTime = System.currentTimeMillis(); 
       
		Object obj=pjp.proceed();  
      
        long stopTime = System.currentTimeMillis();
	      long elapsedTime = stopTime - startTime;
	      System.out.println(elapsedTime); 
        return obj;  
    }  
	
}
