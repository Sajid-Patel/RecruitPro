package com.campus_recruitment.aspects;

import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginTimeAspects {

	Logger logger = LoggerFactory.getLogger(LoginTimeAspects.class);

//	@Before("execution(* com.campus_recruitment.controller.*.*(..))")
//	public void captureStartTime() {
//		System.out.println("Start Time = " + LocalDateTime.now());
//	}
//
//	@After("execution(* com.campus_recruitment.controller.*.*(..))")
//	public void captureEndTime() {
//		System.out.println("End Time = " + LocalDateTime.now());
//	}

	@Around("execution(* com.campus_recruitment.controller.*.*(..))")
	public Object trackExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

		// System.out.println("Start Time = " + LocalDateTime.now());
		long startTime = System.currentTimeMillis();
		Object obj = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		// System.out.println("End Time = " + LocalDateTime.now());

		logger.info("Execution Time =" + (endTime - startTime));
		return obj;

	}
}
