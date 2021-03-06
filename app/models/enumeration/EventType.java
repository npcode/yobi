package models.enumeration;

import play.i18n.Messages;

import java.util.*;

public enum EventType {

    NEW_ISSUE("notification.type.new.issue", 1),
    NEW_POSTING("notification.type.new.posting", 2),
    NEW_PULL_REQUEST("notification.type.new.pullrequest", 3),
    ISSUE_STATE_CHANGED("notification.type.issue.state.changed", 4),
    ISSUE_ASSIGNEE_CHANGED("notification.type.issue.assignee.changed", 5),
    PULL_REQUEST_STATE_CHANGED("notification.type.pullrequest.state.changed", 6),
    NEW_COMMENT("notification.type.new.comment", 7),
    NEW_REVIEW_COMMENT("notification.type.new.simple.comment", 8),
    MEMBER_ENROLL_REQUEST("notification.type.member.enroll", 9),
    PULL_REQUEST_MERGED("notification.type.pullrequest.merged", 10),
    ISSUE_REFERRED_FROM_COMMIT("notification.type.issue.referred.from.commit", 11),
    PULL_REQUEST_COMMIT_CHANGED("notification.type.pullrequest.commit.changed", 12),
    NEW_COMMIT("notification.type.new.commit", 13),
    PULL_REQUEST_REVIEWED("notification.type.pullrequest.reviewed", 14),
    PULL_REQUEST_UNREVIEWED("notification.type.pullrequest.unreviewed", 15),
    ISSUE_BODY_CHANGED("notification.type.issue.body.changed", 17),
    ISSUE_REFERRED_FROM_PULL_REQUEST("notification.type.issue.referred.from.pullrequest", 16),
    REVIEW_THREAD_STATE_CHANGED("notification.type.review.state.changed", 18);

    private String descr;

    private int order;

    private String messageKey;

    EventType(String messageKey, int order) {
        this.messageKey = messageKey;
        this.order = order;
    }

    public String getDescr() {
        return Messages.get(messageKey);
    }

    public int getOrder() {
        return order;
    }

    public static final List<EventType> notiTypes;

    static {
        notiTypes = Arrays.asList(EventType.values());
        Collections.sort(notiTypes, new Comparator<EventType>() {
            @Override
            public int compare(EventType o1, EventType o2) {
                return o1.getOrder() - o2.getOrder();
            }
        });
    }

}
