public class Worker {
    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(50); // Пусть выполнение работы занимает некоторое премя, раз уж мы моделируем.)
            if (i == 33) {
                errorCallback.onError("An error occurred while performing task " + i);
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
