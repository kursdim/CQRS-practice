package ru.sber.queries;

public class GetAllPostsOfTheUserQuery implements Query {
    public long userId;

    public GetAllPostsOfTheUserQuery(long userId) {
        this.userId = userId;
    }
}
