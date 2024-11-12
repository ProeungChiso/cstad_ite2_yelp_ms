package kh.edu.cstad.notification.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NotificationType {
    ALERT("alert"),
    INFO("info"),
    WARNING("warning"),
    SUCCESS("success");

    private final String value;
}
