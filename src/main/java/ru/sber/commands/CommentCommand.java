package ru.sber.commands;

public class CommentCommand implements Command {
    public long id;
    public long postId;
    public String message;

    public CommentCommand(long id, long postId, String message) {
        this.id = id;
        this.postId = postId;
        this.message = message;
    }
}
