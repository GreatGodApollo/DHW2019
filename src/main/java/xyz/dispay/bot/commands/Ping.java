/*
 * DisPay: Discord Currency API
 * Copyright (C) 2019  Brett Bender & Avery Clifton
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package xyz.dispay.bot.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import xyz.dispay.bot.entities.Command;

public class Ping extends Command {

	public Ping() {
		this.name = "ping";
		this.description = "Tests the bot's latency";
	}

	@Override
	public void execute(MessageReceivedEvent event, String[] args) {
		event.getJDA().getRestPing().queue(ping -> {
			event.getChannel().sendMessage("Pong! **" + ping + "**ms").queue();
		});
	}

}
