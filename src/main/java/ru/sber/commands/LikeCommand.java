package ru.sber.commands;

public class LikeCommand implements Command {
    public long postId;

    public LikeCommand(long postId) {
        this.postId = postId;
    }
}
