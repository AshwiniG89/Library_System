public class Module_2 {

    public void chemistry(){

        String chem[]={"Organic chemistry","Inorganic chemistry","Bio chemistry","Physical Chemistry","Polymer chemistry"};
        System.out.println("Books available in the chemistry department are as follow:");

        for(int i=0;i< chem.length;i++){
            System.out.println(" "+chem[i]);
        }
        System.out.println();
    }

    public void physics(){

        String phy[]={"Mechanical physics","Dynamic Physics","Astro physics","Solid state physics","Electromagnetic physics"};
        System.out.println("Books available in the physics department are as follow:");

        for(int i=0;i< phy.length;i++){
            System.out.println(" "+phy[i]);
        }
        System.out.println();
    }

    public void biology(){

        String bio[]={"Botany","Zoology","Marine biology","Molecular biology","Genetics","Micro biology","Medicine","Physiology"};
        System.out.println("Books available in the Biology department are as follow:");

        for(int i=0;i<bio.length;i++){
            System.out.println(" "+bio[i]);
        }
    }
}
