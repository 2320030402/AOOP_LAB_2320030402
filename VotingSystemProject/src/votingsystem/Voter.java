package votingsystem;
public class Voter {
    private String voterId;

    public Voter(String voterId) {
        this.voterId = voterId;
    }
    public String getVoterId() {
        return voterId;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Voter voter = (Voter) obj;
        return voterId.equals(voter.voterId);
    }
    @Override
    public int hashCode() {
        return voterId.hashCode();
    }
}
