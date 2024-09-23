package votingsystem;
public class VotingSystemApp {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        // Register candidates
        votingSystem.registerCandidate("Alice");
        votingSystem.registerCandidate("Bob");
        // Create voters
        Voter voter1 = new Voter("Voter1");
        Voter voter2 = new Voter("Voter2");
        Voter voter3 = new Voter("Voter3");
        // Cast votes
        votingSystem.castVote(voter1, "Alice");
        votingSystem.castVote(voter2, "Bob");
        votingSystem.castVote(voter3, "Alice");
        // Try duplicate vote
        votingSystem.castVote(voter1, "Bob");
        // Print final results
        votingSystem.printResults();
    }
}
