/**
 * Represents a job class in the game.
 */
public class Job {
    private String jobName;
    private int baseLevel;
    private int baseHp;
    private int baseDex;
    private int baseInt;
    private int baseEnd;
    private int baseStr;
    private int baseFth;

    /**
     * Creates a new job based on the specified index.
     *
     * @param index The index representing the job.
     */
    public Job(int index) {
        switch (index) {
            case 1:
                this.jobName = "Vagabond";
                this.baseLevel = 9;
                this.baseHp = 15;
                this.baseDex = 13;
                this.baseInt = 9;
                this.baseEnd = 11;
                this.baseStr = 14;
                this.baseFth = 9;
                break;
            case 2:
                this.jobName = "Samurai";
                this.baseLevel = 9;
                this.baseHp = 12;
                this.baseDex = 15;
                this.baseInt = 9;
                this.baseEnd = 13;
                this.baseStr = 12;
                this.baseFth = 8;
                break;
            case 3:
                this.jobName = "Warrior";
                this.baseLevel = 8;
                this.baseHp = 11;
                this.baseDex = 16;
                this.baseInt = 10;
                this.baseEnd = 11;
                this.baseStr = 10;
                this.baseFth = 8;
                break;
            case 4:
                this.jobName = "Hero";
                this.baseLevel = 7;
                this.baseHp = 14;
                this.baseDex = 9;
                this.baseInt = 7;
                this.baseEnd = 12;
                this.baseStr = 16;
                this.baseFth = 8;
                break;
            case 5:
                this.jobName = "Astrologer";
                this.baseLevel = 6;
                this.baseHp = 9;
                this.baseDex = 12;
                this.baseInt = 16;
                this.baseEnd = 9;
                this.baseStr = 8;
                this.baseFth = 7;
                break;
            case 6:
                this.jobName = "Prophet";
                this.baseLevel = 7;
                this.baseHp = 10;
                this.baseDex = 10;
                this.baseInt = 7;
                this.baseEnd = 8;
                this.baseStr = 11;
                this.baseFth = 16;
                break;
        }
    }

    /**
     * Retrieves the base level of the job.
     *
     * @return The base level.
     */
    public int getBaseLevel() {
        return baseLevel;
    }

    /**
     * Retrieves the base HP of the job.
     *
     * @return The base HP.
     */
    public int getBaseHp() {
        return baseHp;
    }

    /**
     * Retrieves the base DEX of the job.
     *
     * @return The base DEX.
     */
    public int getBaseDex() {
        return baseDex;
    }

    /**
     * Retrieves the base END of the job.
     *
     * @return The base END.
     */
    public int getBaseEnd() {
        return baseEnd;
    }

    /**
     * Retrieves the base INT of the job.
     *
     * @return The base INT.
     */
    public int getBaseInt() {
        return baseInt;
    }

    /**
     * Retrieves the base STR of the job.
     *
     * @return The base STR.
     */
    public int getBaseStr() {
        return baseStr;
    }

    /**
     * Retrieves the base FTH of the job.
     *
     * @return The base FTH.
     */
    public int getBaseFth() {
        return baseFth;
    }

    /**
     * Retrieves the base name of the job.
     *
     * @return The name of the job.
     */
    public String getJobName() {
        return jobName;
    }
}
