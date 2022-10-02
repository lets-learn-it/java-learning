## Thread Termination

If main thread exits and some other thread is still running, then to stop that running thread, we can use method `thread.interrupt()`

But that running thread has to check for interrupted signal explicitely using `Thread.currentThread().isInterrupted()` method. And it that thread receives this signal, then it can exit or throws `InterruptedException`.