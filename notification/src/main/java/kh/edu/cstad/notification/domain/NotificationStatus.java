package kh.edu.cstad.notification.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NotificationStatus {
    UNREAD("unread"),
    READ("read"),
    ARCHIVED("archived");

    private final String value;
}
