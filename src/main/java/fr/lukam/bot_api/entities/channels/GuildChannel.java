package fr.lukam.bot_api.entities.channels;

import fr.lukam.bot_api.behavior.Identifiable;
import fr.lukam.bot_api.entities.guild.Invite;

public interface GuildChannel extends Channel, Identifiable {

    Invite createInvite();

}