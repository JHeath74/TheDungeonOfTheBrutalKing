import java.util.ArrayList;
import java.util.List;



public class ARTDQuests {
    private List<ARTDQuests> activeQuests;
    private List<ARTDQuests> completedQuests;
    
    String QuestName = "";
    String QuestDescription = "";    

    public ARTDQuests() {
        activeQuests = new ArrayList<>();
        completedQuests = new ArrayList<>();
    }

    public void addQuest(ARTDQuests quest) {
        activeQuests.add(quest);
        System.out.println("New quest added: " + quest.getName());
    }

    public void updateQuestProgress(ARTDQuests quest, int progress) {
        quest.setProgress(quest.getProgress() + progress);
        System.out.println("Quest progress updated: " + quest.getName());
        
        if (quest.isComplete()) {
            completeQuest(quest);
        }
    }

    private void completeQuest(ARTDQuests quest) {
        activeQuests.remove(quest);
        completedQuests.add(quest);
        System.out.println("Quest completed: " + quest.getName());
        
        // Provide rewards to the player
        // quest.claimRewards();
    }

    public void showActiveQuests() {
        System.out.println("Active Quests:");
        for (ARTDQuests quest : activeQuests) {
            System.out.println(quest.getName() + " - " + quest.getDescription());
        }
    }

    public void showCompletedQuests() {
        System.out.println("Completed Quests:");
        for (ARTDQuests quest : completedQuests) {
            System.out.println(quest.getName() + " - " + quest.getDescription());
        }
    }
}
