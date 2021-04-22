package ru.sber.queries;

public class SearchUserByNickNameQuery implements Query {
    public String nickName;

    public SearchUserByNickNameQuery(String nickName) {
        this.nickName = nickName;
    }
}
