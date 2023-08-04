package models.works;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Work {
    private long workNo;
    private long userNo;
    private Status status = Status.READY;
    private String subject;
    private String content;
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}
