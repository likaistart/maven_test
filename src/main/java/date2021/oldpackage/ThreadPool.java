package date2021.oldpackage;

//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

/**
 * 线程池
 *
 * @author wangbingtao
 * 2021-01-20
 */
//@Slf4j
//@Configuration
public class ThreadPool {
//    ExecutorService executorService;
//    int availableProcessors = Runtime.getRuntime().availableProcessors();
//
//    public ThreadPool() {
//        this.executorService = new ThreadPoolExecutor(1, 20, 30, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), new ThreadPoolExecutor.AbortPolicy()) {
//            @Override
//            protected void beforeExecute(Thread t, Runnable r) {
//                log.info("beforeExecute is called");
//            }
//
//            @Override
//            protected void afterExecute(Runnable r, Throwable t) {
//                log.info("当前线程核心线程数：{}|最大线程数：{}|当前线程池大小：{}|活动线程数：{}|收到任务：{}|完成任务数：{}|等待任务数：{}",
//                        this.getCorePoolSize(), this.getMaximumPoolSize(), this.getPoolSize(), this.getActiveCount(), this.getTaskCount(), this.getCompletedTaskCount(), this.getQueue().size());
//            }
//
//            @Override
//            protected void terminated() {
//                log.info("terminated is called");
//            }
//        };
//    }
//
//    public ExecutorService getExecutorService() {
//        return executorService;
//    }
//
//    @Bean
//    public ThreadPool getThreadPool() {
//        return new ThreadPool();
//    }
}
