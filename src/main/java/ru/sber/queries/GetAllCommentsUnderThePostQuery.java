package ru.sber.queries;

public class GetAllCommentsUnderThePostQuery implements Query {
    public long postId;

    public GetAllCommentsUnderThePostQuery(long postId) {
        this.postId = postId;
    }
}
