package de.fabianweller.dhbwcoursesbot;

import de.btobastian.sdcf4j.handler.JavacordHandler;
import org.javacord.api.DiscordApiBuilder;

public class DHBWCoursesBot {

    public static void main(String[] args) {

        final var api = new DiscordApiBuilder().setToken(args[0])
                .login().join();
        System.out.println(api.createBotInvite());

        final var handler = new JavacordHandler(api);
        handler.registerCommand(new CoursesCommand());

    }
}
