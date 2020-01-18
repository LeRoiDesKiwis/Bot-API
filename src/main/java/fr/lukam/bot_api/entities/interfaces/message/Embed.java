package fr.lukam.bot_api.entities.interfaces.message;

import fr.lukam.bot_api.behaviors.Fakeable;
import fr.lukam.bot_api.entities.interfaces.user.User;

import java.awt.Color;
import java.util.List;

public interface Embed extends Fakeable {

    User getAuthor();

    String getTitle();

    String getDescription();

    Color getColor();

    List<Field> getFields();

    String getFooter();

    String getImageURL();

}