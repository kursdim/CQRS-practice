package ru.sber.commands;

public class PostCommand implements Command {
    public long id;
    public long userId;
    public String geolocation;
    public String description;

    public PostCommand(long id, long userId, String geolocation, String description) {
        this.id = id;
        this.userId = userId;
        this.geolocation = geolocation;
        this.description = description;
    }
}
