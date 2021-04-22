package ru.sber.queries;

public class GetTheAmountOfLikesUnderThePostQuery implements Query {
    public long postId;

    public GetTheAmountOfLikesUnderThePostQuery(long postId) {
        this.postId = postId;
    }
}
