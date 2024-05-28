package ru.Ablazzing.lesson12_HashMap_HashSet.cloneAgent95;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Agent agent = new Agent("Мистер Смит");
        Agent clone = (Agent) agent.clone();

        System.out.println(agent);
        System.out.println(clone);
        System.out.println(agent.hashCode());
        System.out.println(clone.hashCode());
        System.out.println(agent.getClass());
        System.out.println(clone.getClass());
        System.out.println("-------------");

        //Agent[] agents = makeClones(agent);
        for (Agent smit : makeClones(agent)) {
            System.out.println(smit);
        }
    }

    public static Agent[] makeClones(Agent agent) throws CloneNotSupportedException {

        Agent[] agents = new Agent[10];
        for (int i = 0; i < agents.length; i++) {
            agents[i] = (Agent) agent.clone();
        }
        return agents;
    }
}
