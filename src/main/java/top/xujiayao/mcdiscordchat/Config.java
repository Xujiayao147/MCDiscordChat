package top.xujiayao.mcdiscordchat;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xujiayao
 */
public class Config {

	@Expose
	public Generic generic = new Generic();

	@Expose
	public Texts texts = new Texts();

	public static class Generic {

		// Sets if MCDiscordChat Should Modify In-Game Chat Messages
		@Expose
		public boolean modifyChatMessages = true;

		// Bot Token; see https://discordpy.readthedocs.io/en/latest/discord.html
		@Expose
		public String botToken = "";

		// Bot Game Status; What will be displayed on the bot's game status (leave empty for nothing)
		@Expose
		public String botListeningStatus = "主人敲键盘的声音";

		// Webhook URL; see
		// https://support.discord.com/hc/en-us/articles/228383668-Intro-to-Webhooks
		@Expose
		public String webhookURL = "";

		// Use UUID instead nickname to request player head on webhook
		@Expose
		public boolean useUUIDInsteadNickname = true;

		// Admins ids in Discord; see
		// https://support.discord.com/hc/en-us/articles/206346498-Where-can-I-find-my-User-Server-Message-ID
		// If more than one, enclose each id  like this: {"000", "111", "222"}
		@Expose
		public String[] adminsIds = {};

		// Channel id in Discord
		@Expose
		public String channelId = "";

		// If you enabled "Server Members Intent" in the bot's config page, change it to true.
		// (This is only necessary if you want to enable discord mentions inside the game)
		@Expose
		public boolean membersIntents = true;

		// Should announce when a players join/leave the server?
		@Expose
		public boolean announcePlayers = true;

		// Should announce when a players get an advancement?
		@Expose
		public boolean announceAdvancements = true;

		// Should announce when a player die?
		@Expose
		public boolean announceDeaths = true;

		// Name of the world folder
		@Expose
		public String worldName = "world";

		// Banned Discord users' ID
		@Expose
		public List<String> bannedDiscord = new ArrayList<>();

		// Banned Minecraft players' name
		@Expose
		public List<String> bannedMinecraft = new ArrayList<>();
	}

	public static class Texts {

		// Minecraft -> Discord
		// Server started message
		@Expose
		public String serverStarted = "**服务器已启动！**";

		// Minecraft -> Discord
		// Server stopped message
		@Expose
		public String serverStopped = "**服务器已关闭！**";

		// Minecraft -> Discord
		// Join server
		// ---
		// Available placeholders:
		// %playername% | Player name
		@Expose
		public String joinServer = "**%playername% 加入了服务器**";

		// Minecraft -> Discord
		// Left server
		// ---
		// Available placeholders:
		// %playername% | Player name
		@Expose
		public String leftServer = "**%playername% 离开了服务器**";

		// Minecraft -> Discord
		// Death message
		// ---
		// Available placeholders:
		// %playername% | Player name
		// %deathmessage% | Death message
		@Expose
		public String deathMessage = "**%deathmessage%**";

		// Minecraft -> Discord
		// Advancement type task message
		// ---
		// Available placeholders:
		// %playername% | Player name
		// %advancement% | Advancement name
		@Expose
		public String advancementTask = "**%playername% 达成了进度 [%advancement%]**";

		// Minecraft -> Discord
		// Advancement type challenge message
		// ---
		// Available placeholders:
		// %playername% | Player name
		// %advancement% | Advancement name
		@Expose
		public String advancementChallenge = "**%playername% 完成了挑战 [%advancement%]**";

		// Minecraft -> Discord
		// Advancement type goal message
		// ---
		// Available placeholders:
		// %playername% | Player name
		// %advancement% | Advancement name
		@Expose
		public String advancementGoal = "**%playername% 达成了目标 [%advancement%]**";

		// Discord -> Minecraft
		// Colored part of the message
		// This part of the message will receive the same color as the role in the discord, comes before the colorless part
		// ---
		// Available placeholders:
		// %discordname% | User nickname in the discord server
		// %message% | The message
		@Expose
		public String coloredText = "[Discord] ";

		// Discord -> Minecraft
		// Colorless (white) part of the message
		// I think you already know what it is by the other comment
		// ---
		// Available placeholders:
		// %discordname% | Nickname of the user in the discord server
		// %message% | The message
		@Expose
		public String colorlessText = "<%discordname%> %message%";

		// Replaces the § symbol with & in any discord message to avoid formatted messages
		@Expose
		public boolean removeVanillaFormattingFromDiscord = false;

		// Removes line break from any discord message to avoid spam
		@Expose
		public boolean removeLineBreakFromDiscord = false;
	}
}
