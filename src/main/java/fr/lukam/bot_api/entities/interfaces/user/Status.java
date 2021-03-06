package fr.lukam.bot_api.entities.interfaces.user;

import fr.lukam.bot_api.behaviors.Fakeable;
import fr.lukam.bot_api.behaviors.Nameable;

import java.awt.*;

public interface Status extends Nameable, Fakeable {

    Color getColor();

}
