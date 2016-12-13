package moduleEE2.main.model;

public class DevelopersSkill implements Model{

    private int developerId;
    private int skillId;

    public int getDeveloperId() {
        return developerId;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setDeveloperId(int developerId) {
        this.developerId = developerId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public DevelopersSkill() {
    }

    public DevelopersSkill(int developerId, int skillId) {
        this.developerId = developerId;
        this.skillId = skillId;
    }

    @Override
    public String toString() {
        return "DeveloperSkills{" +
                "developerId=" + developerId +
                ", skillId=" + skillId +
                '}';
    }
}
