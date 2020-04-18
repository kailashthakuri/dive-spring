package io.ace.springframework.aop.schemabased.profiler;


import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class SimpleProfiler {

    public Object profile(ProceedingJoinPoint proceedingJoinPoint, String name, int age) throws Throwable {
        StopWatch stopWatch = new StopWatch("Profiling For : " + name + "'and '" + age + "'");
        try {
            stopWatch.start(proceedingJoinPoint.toShortString());
            return proceedingJoinPoint.proceed();

        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }
    }

}
