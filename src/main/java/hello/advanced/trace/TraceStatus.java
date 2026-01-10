package hello.advanced.trace;

public class TraceStatus {

    private TraceId id;
    private Long startTimeMs;
    private String message;

    public TraceStatus(TraceId id, Long startTimeMs, String message) {
        this.id = id;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMessage() {
        return message;
    }

    public TraceId getTraceId() {
        return id;
    }
}
