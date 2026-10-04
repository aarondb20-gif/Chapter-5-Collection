import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayCollection<Artifact> artifactCollection = new ArrayCollection<>();
        Artifact artifact1 = new Artifact("A101","","");
        Artifact artifact2 = new Artifact("B205","","");
        Artifact artifact3 = new Artifact("C309","","");
        artifactCollection.add(artifact1);
        artifactCollection.add(artifact2);
        artifactCollection.add(artifact3);

        System.out.println(artifactCollection.get(artifact1));
        System.out.println(artifactCollection.contains(artifact1));

        artifactCollection.remove(artifact2);
        System.out.println(artifactCollection.size());
        
        System.out.println(artifactCollection.get(artifact2));
        System.out.println(artifactCollection.contains(artifact2));
        System.out.println(artifactCollection.get(artifact3));
        System.out.println(artifactCollection.contains(artifact3));
    }
}
