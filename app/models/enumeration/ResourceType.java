package models.enumeration;

public enum ResourceType {
    ISSUE_POST("issue_post"),
    ISSUE_ASSIGNEE("issue_assignee"),
    ISSUE_STATE("issue_state"),
    ISSUE_CATEGORY("issue_category"),
    ISSUE_MILESTONE("issue_milestone"),

    ISSUE_LABEL("issue_label"),
    BOARD_POST("board_post"),
    BOARD_CATEGORY("board_category"),
    BOARD_NOTICE("board_notice"),
    CODE("code"),
    MILESTONE("milestone"),
    WIKI_PAGE("wiki_page"),
    PROJECT_SETTING("project_setting"),
    SITE_SETTING("site_setting"),
    USER("user"),
    USER_AVATAR("user_avatar"),
    PROJECT("project"),
    ATTACHMENT("attachment"),
    ISSUE_COMMENT("issue_comment"),
    NONISSUE_COMMENT("nonissue_comment"),
    LABEL("label"),
    PROJECT_LABELS("project_labels"),
    FORK("fork"),
    COMMIT_COMMENT("code_comment"),
    PULL_REQUEST("pull_request"),
    COMMIT("commit"),
    COMMENT_THREAD("comment_thread"),
    REVIEW_COMMENT("review_comment"),
    NOT_A_RESOURCE("");

    private String resource;

    ResourceType(String resource) {
        this.resource = resource;
    }

    public String resource() {
        return this.resource;
    }

    public static ResourceType getValue(String value) {
        for (ResourceType resourceType : ResourceType.values()) {
            if (resourceType.resource().equals(value)) {
                return resourceType;
            }
        }
        throw new IllegalArgumentException("No matching resource type found for [" + value + "]");
    }
}
