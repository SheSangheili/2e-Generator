/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.folder;

/**
 *
 * @author Baby_
 */
public class advanced {
    String[] x = {"Agitator:+5% +5% - - +5% +10% - +10% - +2 - - - - - -",
            "Apprentice Wizard:- - - - +5% +10% +15% +5% - +2 - - - +1 - -",
            "Bailiff:+5% +5% +5% - - +10% +5% +10% - +2 - - - - - -",
            "Barber-Surgeon:+5% - - - +10% +10% +10% +5% - +2 - - - - - -",
            "Boatman:+10% +5% +5% +5% +10% +5% - - - +2 - - - - - -",
            "Bodyguard:+10% - +5% +5% +5% - - - +1 +3 - - - - - -",
            "Bone Picker:+5% - +5% +10% +5% - +5% +5% - +2 - - - - - -",
            "Bounty Hunter:+5% +10% +5% - +10% - +5% - - +2 - - - - - -",
            "Burgher:+5% - - - +5% +10% +5% +5% - +2 - - - - - -",
            "Camp Follower:- - - +5% +10% +5% +5% +10% - +2 - - - - - -",
            "Charcoal-Burner:+5% - +5% +5% +5% +5% +5% +5% - +2 - - - - - -",
            "Coachman:+5% +10% - - +10% - +5% +5% - +2 - - - - - -",
            "Entertainer:+5% +10% - - +10% - +5% +10% - +2 - - - - - -",
            "Envoy:+5% +5% - - +5% +10% +5% +10% - +2 - - - - - -",
            "Estalian Diestro:+15% - +5% +5% +10% +5% - - +1 +2 - - - - - -",
            "Ferryman:+5% +5% +10% +5% +5% +5% - - - +2 - - - - - -",
            "Fieldwarden:+5% +10% - +5% +10% - +10% - - +2 - - - - - -",
            "Fisherman:- +5% +10% +5% +10% +5% - - - +2 - - - - - -",
            "Grave Robber:+5% +5% +5% - +10% - +10% - - +2 - - - - - -",
            "Hedge Wizard:- - - +5% +5% +5% +10% +10% - +2 - - - +1 - -",
            "Hunter:- +15% - +5% +10% +5% - - - +3 - - - - - -",
            "Initiate:+5% +5% - +5% - +10% +10% +10% - +2 - - - - - -",
            "Jailer:+10% - +10% +10% - - +5% - - +3 - - - - - -",
            "Kislevite Kossar:+10% +10% - +10% - - +10% - - +2 - - - - - -",
            "Kithband Warrior:+5% +5% - - +10% +10% +5% - - +2 - - - - - -",
            "Marine:+10% +10% +10% - +5% - +5% - +1 +3 - - - - - -",
            "Mercenary:+10% +10% +5% +5% +5% - +5% - +1 +2 - - - - - -",
            "Messenger:+5% +5% - +5% +10% +5% +5% - - +2 - - - - - -",
            "Militiaman:+10% +5% +5% +5% +10% - - - - +2 - - - - - -",
            "Miner:+5% +5% +10% +5% - +5% +5% - - +2 - - - - - -",
            "Noble:+10% +5% - - +5% +5% +5% +10% - +2 - - - - - -",
            "Norse Berserker:+15% - +10% +10% - - +10% - - +2 - - - - - -",
            "Outlaw:+10% +10% - - +10% +5% - - +1 +2 - - - - - -",
            "Outrider:+5% +10% - - +10% +10% +5% - - +2 - - - - - -",
            "Peasant:+5% +5% +5% +10% +5% - +5% - - +2 - - - - - -",
            "Pit Fighter:+15% - - +10% +10% - +10% - - +2 - - - - - -",
            "Protagonist:+10% - +10% - +10% - +10% - +1 +2 - - - - - -",
            "Rat Catcher:+5% +10% - +5% +10% - +10% - - +2 - - - - - -",
            "Roadwarden:+10% +10% +5% - +10% +5% +5% - - +2 - - - - - -",
            "Rogue:+5% +5% - - +10% +5% +5% +10% - +2 - - - - - -",
            "Runebearer:+10% - +5% +5% +10% +5% +5% - - +2 - - +1 - - -",
            "Scribe:- - - - +10% +10% +10% +5% - +2 - - - - - -",
            "Seaman:+10% +5% +10% - +10% - - - +1 +2 - - - - - -",
            "Servant:+5% - +5% - +10% +5% +10% +5% - +2 - - - - - -",
            "Shieldbreaker:+10% - +5% +5% +10% - +5% - +1 +2 - - - - - -",
            "Smuggler:+5% +5% - - +10% +10% - +10% - +2 - - - - - -",
            "Soldier:+10% +10% - - +10% - +5% - +1 +2 - - - - - -",
            "Squire:+10% +5% +5% +5% +5% - - +5% +1 +2 - - - - - -",
            "Student:- - - - +10% +10% +5% +10% - +2 - - - - - -",
            "Thief:+5% +5% - - +15% +5% - +10% - +2 - - - - - -",
            "Thug:+10% - +5% +5% - - +5% +5% +1 +2 - - - - - -",
            "Toll Keeper:+10% +5% +5% +10% +5% - +5% - - +2 - - - - - -",
            "Tomb Robber:+10% - - - +10% +10% +10% +5% - +2 - - - - - -",
            "Tradesman:- - +5% +5% +10% +5% +10% - - +2 - - - - - -",
            "Troll Slayer:+10% - +5% +5% +5% - +10% - +1 +3 - - - - - -",
            "Vagabond:+5% +10% - - +10% +5% - +5% - +2 - - - - - -",
            "Valet:- - - - +10% +10% +5% +10% - +2 - - - - - -",
            "Watchman:+10% +5% +5% - +5% +10% - +5% - +2 - - - - - -",
            "Woodsman:+10% - +10% - +5% - +10% - - +3 - - - - - -",
            "Zealot:+10% - +5% +10% - - +10% +5% - +2 - - - - - -"};
}
