/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examples.folder;
import java.util.*;
import java.io.*;

/**
 *
 * @author Baby_
 */
public class WarhamerGenerator extends javax.swing.JFrame {

    /**
     *Has the descriptions of the class
     */
    public static HashMap<String, String> lore = new HashMap<String, String>();

    /**
     *Has a list of class skills
     */
    public static HashMap<String, String> skill = new HashMap<String, String>();    

    /**
     *Has list of talents
     */
    public static HashMap<String, String> talent = new HashMap<String, String>();

    /**
     *Has list of trappings
     */
    public static HashMap<String, String> trap = new HashMap<String, String>();

    /**
     *Career entries and exits
     */
    public static HashMap<String, String> entext = new HashMap<String, String>();

    /**
     *Talent descriptions
     */
    public static HashMap<String, String> taldis = new HashMap<String, String>();

    /**
     *Career talent list
     */
    public static HashMap<String, String> tallist = new HashMap<String, String>();

    /**
     *Class advances
     */
    public static HashMap<String, String> advance = new HashMap<String, String>();
    
    public static String blah;
    
    /**
     * Trying to populate the tables
     * @param val string of values
     */
    public void tablePop(String val){
        String [] parts = val.split(" ");
        
        jTable1.setValueAt(parts[0], 0, 0); //WS
        jTable1.setValueAt(parts[1], 0, 1); //BS
        jTable1.setValueAt(parts[2], 0, 2); //S
        jTable1.setValueAt(parts[3], 0, 3); //T
        jTable1.setValueAt(parts[4], 0, 4); //Ag
        jTable1.setValueAt(parts[5], 0, 5); //Int
        jTable1.setValueAt(parts[6], 0, 6); //WP
        jTable1.setValueAt(parts[7], 0, 7); //Fel
        jTable2.setValueAt(parts[8], 0, 0); //A
        jTable2.setValueAt(parts[9], 0, 1); //W
        jTable2.setValueAt(parts[10], 0, 2); //SB
        jTable2.setValueAt(parts[11], 0, 3); //TB
        jTable2.setValueAt(parts[12], 0, 4); //M
        jTable2.setValueAt(parts[13], 0, 5); //Mag
        jTable2.setValueAt(parts[14], 0, 6); //IP
        jTable2.setValueAt(parts[15], 0, 7); //FP
    }
    
    
    /**
     * Talent discriptors trying to work smarter not harder
     * given tallist will give the descriptions of taldis
     * @param val this is the value from tallist
     * @return 
     */
    public String getDiscript(String val){
        String hold = "";
        String [] parts = val.split(",");
        
        for (String x : parts){
            hold += x+':'+taldis.get(x)+'\n'+'\n';
        }
        return hold;
    }
    
    public String sepEntExt(String val){
        String hold = "";
        String [] parts = val.split(";");

        
        for(String x : parts){
            hold += x + '\n';
        }
        
        return hold;
    }
    
    /**
     * Species ArrayLists of base jobs they can have
     */
    // <editor-fold>
    ArrayList<String> hum = new ArrayList<String>(
                Arrays.asList("Agitator", "Apprentice Wizard", "Bailiff","Barber-Surgeon",
                        "Boatman","Bodyguard","Bone Picker","Bounty Hunter","Burgher",
                        "Camp Follower","Charcoal-Burner","Coachman","Entertainer",
                        "Estalian Diestro","Ferryman","Fisherman","Grave Robber",
                        "Hedge Wizard","Hunter","Initiate","Jailer","Kislevite Kossar",
                        "Marine","Mercenary","Messenger","Militiaman","Miner","Noble","Norse Berserker",
                        "Outlaw","Outrider","Peasant","Pit Fighter","Protagonist",
                        "Rat Catcher","Roadwarden","Rogue","Scribe","Seaman","Servant",
                        "Smuggler","Soldier","Squire","Student","Thief","Thug",
                        "Toll Keeper","Tomb Robber","Tradesman","Vagabond","Valet",
                        "Watchman","Woodsman","Zealot"));
    Object[] humcareer = hum.toArray();
    ArrayList<String> elv = new ArrayList<String>(
                Arrays.asList("Apprentice Wizard","Entertainer","Envoy","Hunter",
                        "Kithband Warrior","Mercenary","Messenger","Outlaw","Outrider",
                        "Rogue","Scribe","Seaman","Student","Thief","Tradesman",
                        "Vagabond"));
    Object[] elfcareer = elv.toArray();
    ArrayList<String> half = new ArrayList<String>(
                Arrays.asList("Agitator","Barber-Surgeon","Bone Picker",
                        "Bounty Hunter","Burgher","Camp Follower","Charcoal-Burner",
                        "Entertainer","Ferryman","Fieldwarden","Fisherman",
                        "Grave Robber","Hunter","Mercenary","Messenger","Militiaman",
                        "Outlaw","Peasant","Rat Catcher","Rogue","Servant",
                        "Smuggler","Soldier","Student","Thief","Toll Keeper",
                        "Tomb Robber","Tradesman","Vagabond","Valet",
                        "Watchman"));
    Object[] halfcareer = half.toArray();
    ArrayList<String> dwf = new ArrayList<String>(
                Arrays.asList("Agitator","Bodyguard","Burgher","Coachman",
                        "Entertainer","Hunter","Jailer","Marine","Mercenary",
                        "Militiaman","Miner","Noble","Outlaw","Pit Fighter",
                        "Protagonist","Rat Catcher","Runebearer","Scribe",
                        "Seaman","Servant","Shieldbreaker","Smuggler","Soldier",
                        "Student","Thief","Toll Keeper","Tomb Robber",
                        "Tradesman","Troll Slayer","Watchman"));
    Object[] dwarfcareer = dwf.toArray();
    // </editor-fold>
    
    
    
    
    
    
    Random rand = new Random();
    
    /**
     * Human talents
     * @param index
     * @return
     */
    public String getTalents(int index){
        int a;
        a = rand.nextInt(100)+1;
        int b;
        b = rand.nextInt(100)+1;
        int x = 1;
        int d = 0;
        
        if( a == b ){
            b = rand.nextInt(100)+1;
        }
        
        String Talents = "";
        
        if(index == 0){
            while(x<=2){
                if(x == 1){
                    d = a;
                } else if (x == 2){
                    d = b;
                }
                
                switch (d){
                    case 1: case 2: case 3: case 4:{
                        Talents += " Acute Hearing ";
                        break;
                    }
                    case 5: case 6: case 7: case 8: case 9:{
                        Talents += " Ambidextrous ";
                        break;
                    }
                    case 10: case 11: case 12: case 13:{
                        Talents += " Coolheaded ";
                        break;
                    }
                    case 14: case 15: case 16: case 17: case 18:{
                        Talents += " Excellent Vision ";
                        break;
                    }
                    case 19: case 20: case 21: case 22:{
                        Talents += " Fleet Footed ";
                        break;
                    }
                    case 23: case 24: case 25: case 26: case 27:{
                        Talents += " Hardy ";
                        break;
                    }
                    case 28: case 29: case 30: case 31:{
                        Talents += " Lightning Reflexes ";
                        break;
                    }
                    case 32: case 33: case 34: case 35:{
                        Talents += " Luck ";
                        break;
                    } 
                    case 36: case 37: case 38: case 39: case 40:{
                        Talents += " Marksman ";
                        break;
                    }
                    case 41: case 42: case 43: case 44:{
                        Talents += " Mimic ";
                        break;
                    }
                    case 45: case 46: case 47: case 48: case 49:{
                        Talents += " Night Vision ";
                        break;
                    } 
                    case 50: case 51: case 52: case 53:{
                        Talents += " Resistance to Disease ";
                        break;
                    }
                    case 54: case 55: case 56: case 57:{
                        Talents += " Resistance to Magic ";
                        break;
                    }
                    case 58: case 59: case 60: case 61:{
                        Talents += " Resistance to Poison ";
                        break;
                    }
                    case 62: case 63: case 64: case 65: case 66:{
                        Talents += " Savvy ";
                        break;
                    }
                    case 67: case 68: case 69: case 70: case 71:{
                        Talents += " Sixth Sense ";
                        break;
                    }
                    case 72: case 73: case 74: case 75:{
                        Talents += " Strong-minded ";
                        break;
                    }
                    case 76: case 77: case 78: case 79:{
                        Talents += " Sturdy ";
                        break;
                    }
                    case 80: case 81: case 82: case 83:{
                        Talents += " Suave ";
                        break;
                    }
                    case 84: case 85: case 86: case 87:{
                        Talents += " Super Numerate ";
                        break;
                    }
                    case 88: case 89: case 90: case 91:{
                        Talents += " Very Resilient ";
                        break;
                    }
                    case 92: case 93: case 94: case 95:{
                        Talents += " Very Strong ";
                        break;
                    }
                    case 96: case 97: case 98: case 99: case 100:{
                        Talents += " Warrior Born ";
                        break;
                    }
                }
                
                x++;
            }
        
        }
        else{
            switch (a){
                case 1: case 2: case 3: case 4: case 5:{
                    Talents += " Acute Hearing ";
                    break;
                }
                case 6: case 7: case 8: case 9: case 10:{
                    Talents += " Ambidextrous ";
                    break;
                }
                case 11: case 12: case 13: case 14: case 15:{
                    Talents += " Coolheaded ";
                    break;
                }
                case 16: case 17: case 18: case 19: case 20:{
                    Talents += " Excellent Vision ";
                    break;
                }
                case 21: case 22: case 23: case 24: case 25:{
                    Talents += " Fleet Footed ";
                    break;
                }
                case 26: case 27: case 28: case 29:{
                    Talents += " Hardy ";
                    break;
                }
                case 30: case 31: case 32: case 33:{
                    Talents += " Lightning Reflexes ";
                    break;
                }
                case 34: case 35: case 36: case 37: case 38:{
                    Talents += " Luck ";
                    break;
                }
                case 39: case 40: case 41: case 42:{
                    Talents += " Marksman ";
                    break;
                }
                case 43: case 44: case 45: case 46: case 47:{
                    Talents += " Mimic ";
                    break;
                }
                case 48: case 49: case 50: case 51:{
                    Talents += " Resistance to Disease ";
                    break;
                }
                case 52: case 53:{
                    Talents += " Resistance to Magic ";
                    break;
                }
                case 54: case 55: case 56: case 57:{
                    Talents += " Resistance to Poison ";
                    break;
                }
                case 58: case 59: case 60: case 61: case 62:{
                    Talents += " Savvy ";
                    break;
                }
                case 63: case 64: case 65: case 66: case 67:{
                    Talents += " Sixth Sense ";
                    break;
                }
                case 68: case 69: case 70: case 71: case 72:{
                    Talents += " Strong-minded ";
                    break;
                }
                case 73: case 74: case 75: case 76: case 77:{
                    Talents += " Sturdy ";
                    break;
                }
                case 78: case 79: case 80: case 81: case 82:{
                    Talents += " Suave ";
                    break;
                }
                case 83: case 84: case 85: case 86: case 87:{
                    Talents += " Super Numerate ";
                    break;
                }
                case 88: case 89: case 90: case 91:{
                    Talents += " Very Resilient ";
                    break;
                }
                case 92: case 93: case 94: case 95:{
                    Talents += " Very Strong ";
                    break;
                }
                case 96: case 97: case 98: case 99: case 100:{
                    Talents += " Warrior Born ";
                    break;
                }
            }
        }
        return Talents;
    }
    
    /**
     * Double rolls
     * @return
     */
    public int getRolls(){
        int a;
        a = rand.nextInt(10)+1;
        int b;
        b = rand.nextInt(10)+1;
        int c;
        c = 0;
        
        blah = a+" "+b+"";
        
        if(DoubleRoll.isSelected()) {
            if(a == b){
                c = a+b+1;
            }
            else{
                c = a+b;
            }
        } else {
            c = a + b;
        }
        return c;
    }
    
    /**
     *
     * @param a birthrand1
     * @param b birthrand2
     * @return String
     */
    public String getHuman(int a, int b){
        String One;
        One = "";
        String Two;
        Two = "";
        
        switch (a){
            case 1: {
                One = "Averland";
                break;
            }
            case 2: {
                One = "Hochland";
                break;
            }
            case 3: {
                One = "Middenland";
                break;
            }
            case 4: {
                One = "Nordland";
                break;
            }
            case 5: {
                One = "Ostermark";
                break;
            }
            case 6: {
                One = "Ostland";
                break;
            }
            case 7: {
                One = "Reikland";
                break;
            }
            case 8: {
                One = "Stirland";
                break;
            }
            case 9: {
                One = "Talabecland";
                break;
            }
            case 10: {
                One = "Wissenland";
                break;
            }
        }
        
        switch (b){
            case 1: {
                Two = "City";
                break;
            }
            case 2: {
                Two = "Prosperous Town";
                break;
            }
            case 3: {
                Two = "Market Town";
                break;
            }
            case 4: {
                Two = "Fortified Town";
                break;
            }
            case 5: {
                Two = "Farming Village";
                break;
            }
            case 6: {
                Two = "Poor Village";
                break;
            }
            case 7: {
                Two = "Small Settlement";
                break;
            }
            case 8: {
                Two = "Pig/Cattle Farm";
                break;
            }
            case 9: {
                Two = "Arable Farm";
                break;
            }
            case 10: {
                Two = "Hovel";
                break;
            }
        }
        
        return One + ": " + Two;
    }
    
    
    /**
     * Creates new form WarhamerGenerator
     */
    public WarhamerGenerator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgeDisplay = new javax.swing.JTextField();
        SiblingsDisplay = new javax.swing.JTextField();
        Height = new javax.swing.JLabel();
        MarksDisplay = new javax.swing.JTextField();
        Weight = new javax.swing.JLabel();
        EyeDisplay = new javax.swing.JTextField();
        HairColor = new javax.swing.JLabel();
        HairDisplay = new javax.swing.JTextField();
        EyeColor = new javax.swing.JLabel();
        WeightDisplay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        HeightDisplay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        StarDisplay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BirthDisplay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Race = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Gender = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        SigDisplay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        WSRoll = new javax.swing.JTextField();
        BSRoll = new javax.swing.JTextField();
        StrRoll = new javax.swing.JTextField();
        TRoll = new javax.swing.JTextField();
        ARoll = new javax.swing.JTextField();
        IntRoll = new javax.swing.JTextField();
        WPRoll = new javax.swing.JTextField();
        FelRoll = new javax.swing.JTextField();
        AttDisplay = new javax.swing.JTextField();
        HPRoll = new javax.swing.JTextField();
        SBDisplay = new javax.swing.JTextField();
        TBDisplay = new javax.swing.JTextField();
        MoveDisplay = new javax.swing.JTextField();
        MagDisplay = new javax.swing.JTextField();
        IPDisplay = new javax.swing.JTextField();
        FPRoll = new javax.swing.JTextField();
        DoubleRoll = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        RacialDisplay = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        CareerList = new javax.swing.JList();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Fluff = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        Skills = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        Talent = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        Trappings = new javax.swing.JScrollPane();
        Trap = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        EntExt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AgeDisplay.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        AgeDisplay.setText("jTextField3");

        SiblingsDisplay.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        SiblingsDisplay.setText("jTextField4");

        Height.setText("Height");

        MarksDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MarksDisplay.setText("jTextField5");

        Weight.setText("Weight");

        EyeDisplay.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        EyeDisplay.setText("jTextField6");

        HairColor.setText("Hair Color");

        HairDisplay.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        HairDisplay.setText("jTextField7");

        EyeColor.setText("Eye Color");

        WeightDisplay.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        WeightDisplay.setText("jTextField8");

        jLabel1.setText("Marks");

        HeightDisplay.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        HeightDisplay.setText("jTextField9");

        jLabel2.setText("Siblings");

        StarDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StarDisplay.setText("jTextField10");

        jLabel3.setText("Age in Years");

        BirthDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BirthDisplay.setText("jTextField11");

        jLabel4.setText("Star Sign");

        Race.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Human", "Elf", "Dwarf", "Halfling" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        Race.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Race.setToolTipText("");
        jScrollPane2.setViewportView(Race);

        jLabel5.setText("Birthplace");

        Gender.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Male", "Female" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        Gender.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(Gender);

        jButton1.setText("Roll");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SigDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SigDisplay.setText("jTextField1");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Weapon Skill");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ballistic Skill");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Strength");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Toughness");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Agility");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Intelligence");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Will Power");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Fellowship");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Attacks");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Wounds");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Strength Bonus");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Toughness Bonus");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Movement");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Magic");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Insanity Points");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Fate Points");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        WSRoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BSRoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        StrRoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TRoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ARoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        IntRoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        WPRoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        FelRoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        AttDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        HPRoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SBDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TBDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        MoveDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        MagDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        IPDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        FPRoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        DoubleRoll.setText("Double Rule?");

        RacialDisplay.setEditable(false);
        RacialDisplay.setColumns(20);
        RacialDisplay.setLineWrap(true);
        RacialDisplay.setRows(5);
        RacialDisplay.setWrapStyleWord(true);
        RacialDisplay.setAutoscrolls(false);
        RacialDisplay.setFocusable(false);
        jScrollPane3.setViewportView(RacialDisplay);

        CareerList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Agitator", "Apprentice Wizard", "Bailiff", "Barber-Surgeon", "Boatman", "Bodyguard", "Bone Picker", "Bounty Hunter", "Burgher", "Camp Follower", "Charcoal-Burner", "Coachman", "Entertainer", "Envoy", "Estalian Diestro", "Ferryman", "Fieldwarden", "Fisherman", "Grave Robber", "Hedge Wizard", "Hunter", "Initiate", "Jailer", "Kislevite Kossar", "Kithband Warrior", "Marine", "Mercenary", "Messenger", "Militiaman", "Miner", "Noble", "Norse Berserker", "Outlaw", "Outrider", "Peasant", "Pit Fighter", "Protagonist", "Rat Catcher", "Roadwarden", "Rogue", "Runebearer", "Scribe", "Seaman", "Servant", "Shieldbreaker", "Smuggler", "Soldier", "Squire", "Student", "Thief", "Thug", "Toll Keeper", "Tomb Robber", "Tradesman", "Troll Slayer", "Vagabond", "Valet", "Watchman", "Woodsman", "Zealot" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        CareerList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        CareerList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                CareerListValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(CareerList);

        jLabel22.setText("Career Title");

        Fluff.setColumns(20);
        Fluff.setLineWrap(true);
        Fluff.setRows(5);
        Fluff.setWrapStyleWord(true);
        Fluff.setAutoscrolls(false);
        jScrollPane5.setViewportView(Fluff);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "WS", "BS", "Str", "T", "Agi", "Int", "WP", "Fel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowHeight(30);
        jTable1.setRowSelectionAllowed(false);
        jScrollPane6.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Att", "HP", "SB", "TB", "Move", "Mag", "IP", "FP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setEnabled(false);
        jTable2.setFocusable(false);
        jTable2.setRowHeight(30);
        jScrollPane7.setViewportView(jTable2);

        Skills.setColumns(20);
        Skills.setLineWrap(true);
        Skills.setRows(5);
        Skills.setToolTipText("");
        Skills.setWrapStyleWord(true);
        Skills.setAutoscrolls(false);
        jScrollPane8.setViewportView(Skills);

        jLabel23.setText("Skills");

        jLabel24.setText("Talents");

        Talent.setColumns(20);
        Talent.setLineWrap(true);
        Talent.setRows(5);
        Talent.setWrapStyleWord(true);
        Talent.setAutoscrolls(false);
        jScrollPane9.setViewportView(Talent);

        jLabel25.setText("Trappings");

        Trappings.setRowHeaderView(null);

        Trap.setColumns(20);
        Trap.setLineWrap(true);
        Trap.setRows(5);
        Trap.setWrapStyleWord(true);
        Trap.setAutoscrolls(false);
        Trappings.setViewportView(Trap);

        jLabel26.setText("Career Choices");

        EntExt.setColumns(20);
        EntExt.setLineWrap(true);
        EntExt.setRows(5);
        EntExt.setWrapStyleWord(true);
        EntExt.setAutoscrolls(false);
        jScrollPane10.setViewportView(EntExt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BirthDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(StarDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Height, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(Weight)
                                                        .addGap(16, 16, 16)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(HeightDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(WeightDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addComponent(DoubleRoll))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(HairColor)
                                        .addGap(18, 18, 18)
                                        .addComponent(HairDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(AgeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(MarksDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(EyeColor))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(35, 35, 35)
                                                    .addComponent(SiblingsDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(22, 22, 22)
                                                    .addComponent(EyeDisplay))))))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(SigDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ARoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IntRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WPRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FelRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AttDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HPRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SBDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TBDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MoveDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MagDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IPDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FPRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WSRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BSRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StrRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(138, 138, 138)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(204, 204, 204))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(188, 188, 188))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(199, 199, 199))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Trappings, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                                        .addComponent(jScrollPane9)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane8)))
                                .addGap(48, 48, 48))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(196, 196, 196))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(178, 178, 178))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Height)
                                    .addComponent(HeightDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Weight)
                                    .addComponent(WeightDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(HairColor)
                                    .addComponent(HairDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EyeColor)
                                    .addComponent(EyeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(SiblingsDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(AgeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MarksDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(BirthDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(StarDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SigDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WSRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DoubleRoll))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BSRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StrRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ARoll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IntRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WPRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FelRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AttDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HPRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SBDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TBDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MoveDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MagDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IPDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FPRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Trappings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane10)))))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int Raceindex = Race.getSelectedIndex();
        int Genderindex = Gender.getSelectedIndex();
        int Heightrand = rand.nextInt(10)+1;
        int Hairrand = rand.nextInt(10)+1;
        int Eyerand = rand.nextInt(10)+1;
        int Weightrand = rand.nextInt(100)+1;
        int Marksrand = rand.nextInt(100)+1;
        int Sibsrand = rand.nextInt(10)+1;
        int Agerand = rand.nextInt(100)+1;
        int Starrand = rand.nextInt(100)+1;
        int HPrand = rand.nextInt(10)+1;
        int FPrand = rand.nextInt(10)+1;
        int birthrand1 = rand.nextInt(10)+1;
        int birthrand2 = rand.nextInt(10)+1;
        int birthrand3;
        birthrand3 = rand.nextInt(100)+1;
        
        // Could probably make this a function
        switch (Marksrand){// <editor-fold>
            case 1: case 2: case 3: case 4: case 5:{
                MarksDisplay.setText("Pox Marks");
                break;
            }
            case 6: case 7: case 8: case 9: case 10:{
                MarksDisplay.setText("Ruddy Face");
                break;
            }
            case 11: case 12: case 13: case 14: case 15:{
                MarksDisplay.setText("Scar");
                break;
            }
            case 16: case 17: case 18: case 19: case 20: {
                MarksDisplay.setText("Tattoo");
                break;
            }
            case 21: case 22: case 23: case 24: case 25: {
                MarksDisplay.setText("Earring");
                break;
            }
            case 26: case 27: case 28: case 29: {
                MarksDisplay.setText("Ragged Ear");
                break;
            }
            case 30: case 31: case 32: case 33: case 34: case 35: {
                MarksDisplay.setText("Nose Ring");
                break;
            }
            case 36: case 37: case 38: case 39: {
                MarksDisplay.setText("Wart");
                break;
            }
            case 40: case 41: case 42: case 43: case 44: case 45: {
                MarksDisplay.setText("Broken Nose");
                break;
            }
            case 46: case 47: case 48: case 49: case 50: {
                MarksDisplay.setText("Missing Tooth");
                break;
            }
            case 51: case 52: case 53: case 54: case 55: {
                MarksDisplay.setText("Snaggle Teeth");
                break;
            }
            case 56: case 57: case 58: case 59: case 60: {
                MarksDisplay.setText("Lazy Eye");
                break;
            }
            case 61: case 62: case 63: case 64: case 65: {
                MarksDisplay.setText("Missing Eyebrow(s)");
                break;
            }
            case 66: case 67: case 68: case 69: case 70: {
                MarksDisplay.setText("Missing Digit");
                break;
            }
            case 71: case 72: case 73: case 74: case 75: {
                MarksDisplay.setText("Missing Nail");
                break;
            }
            case 76: case 77: case 78: case 79: case 80: {
                MarksDisplay.setText("Distinctive Gait");
                break;
            }
            case 81: case 82: case 83: case 84: {
                MarksDisplay.setText("Curious Smell");
                break;
            }
            case 85: case 86: case 87: case 88: case 89: {
                MarksDisplay.setText("Huge Nose");
                break;
            }
            case 90: case 91: case 92: case 93: case 94: {
                MarksDisplay.setText("Large Mole");
                break;
            }
            case 95: case 96: case 97: case 98: {
                MarksDisplay.setText("Small Bald Patch");
                break;
            }
            case 99: case 100: {
                MarksDisplay.setText("Colored Eye(s)");
                break;
            }
        }// </editor-fold>
        // could probably make this a function
        switch (Starrand) { // <editor-fold>
            case 1: case 2: case 3: case 4: case 5:{
                StarDisplay.setText("Wymund the Anchorite");
                SigDisplay.setText("Sign of Enduring");
                break;
            }
            case 6: case 7: case 8: case 9: case 10:{
                StarDisplay.setText("The Big Cross");
                SigDisplay.setText("Sign of Clarity");
                break;
            }
            case 11: case 12: case 13: case 14: case 15:{
                StarDisplay.setText("The Limner's Line");
                SigDisplay.setText("Sign of Precision");
                break;
            }
            case 16: case 17: case 18: case 19: case 20: 
            case 21: case 22: case 23: case 24: case 25:{
                StarDisplay.setText("Gnuthus the Ox");
                SigDisplay.setText("Sign of Dutiful Service");
                break;
            }
            case 26: case 27: case 28: case 29: case 30: {
                StarDisplay.setText("Dragonmas the Drake");
                SigDisplay.setText("Sign of Courage");
                break;
            }
            case 31: case 32: case 33: case 34: case 35: {
                StarDisplay.setText("The Gloaming");
                SigDisplay.setText("Sign of Illusion and Mystery");
                break;
            }
            case 36: case 37: case 38: case 39: case 40: {
                StarDisplay.setText("Grungni's Baldric");
                SigDisplay.setText("Sign of Matrial Pursuits");
                break;
            }
            case 41: case 42: case 43: case 44: case 45: {
                StarDisplay.setText("Mammit the Wise");
                SigDisplay.setText("Sign of Wisdom");
                break;
            }
            case 46: case 47: case 48: case 49: case 50: {
                StarDisplay.setText("Mummit the Fool");
                SigDisplay.setText("Sign of Instinct");
                break;
            }
            case 51: case 52: case 53: case 54: case 55: {
                StarDisplay.setText("The Two Bullocks");
                SigDisplay.setText("Sign of Fertility and Craftsmanship");
                break;
            }
            case 56: case 57: case 58: case 59: case 60: {
                StarDisplay.setText("The Dancer");
                SigDisplay.setText("Sign of Love and Attraction");
                break;
            }
            case 61: case 62: case 63: case 64: case 65: {
                StarDisplay.setText("The Drummer");
                SigDisplay.setText("Sign of Excess and Hedonism");
                break;
            }
            case 66: case 67: case 68: case 69: case 70: {
                StarDisplay.setText("The Piper");
                SigDisplay.setText("Sign of the Trickster");
                break;
            }
            case 71: case 72: case 73: case 74: case 75: {
                StarDisplay.setText("Vobist the Faint");
                SigDisplay.setText("Sign of Darkness and Uncertainty");
                break;
            }
            case 76: case 77: case 78: case 79: case 80: {
                StarDisplay.setText("The Broken Cart");
                SigDisplay.setText("Sign of Pride");
                break;
            }
            case 81: case 82: case 83: case 84: case 85: {
                StarDisplay.setText("The Greased Goat");
                SigDisplay.setText("Sign of Denied Passions");
                break;
            }
            case 86: case 87: case 88: case 89: case 90: {
                StarDisplay.setText("Rhya's Cauldron");
                SigDisplay.setText("Sign of Mercy, Death, and Creation");
                break;
            }
            case 91: case 92: case 93: case 94: case 95: {
                StarDisplay.setText("Cackelfax the Cockerel");
                SigDisplay.setText("Sign of Money "
                        + "and Merchants");
                break;
            }
            case 96: case 97: case 98: {
                StarDisplay.setText("The Bonesaw");
                SigDisplay.setText("Sign of Skill "
                        + "and Learning");
                break;
            }
            case 99: case 100: {
                StarDisplay.setText("The Witchling Star");
                SigDisplay.setText("Sign of Magic");
                break;
            }
        }// </editor-fold>
        
        switch (Raceindex){
            case 0: {
                //human
                // <editor-fold>
                if(Genderindex == 0){
                    HeightDisplay.setText("5'"+(4+Heightrand)+"");
                    // figure out how to roll over the height
                }
                else{
                    HeightDisplay.setText("5'"+(1+Heightrand)+"");
                }
                switch (Hairrand){ // <editor-fold>
                    case 1:{
                        HairDisplay.setText("Ash Blond");
                        break;
                    }
                    case 2:{
                        HairDisplay.setText("Corn");
                        break;
                    }
                    case 3:{
                        HairDisplay.setText("Yellow");
                        break;
                    }
                    case 4:{
                        HairDisplay.setText("Copper");
                        break;
                    }
                    case 5:{
                        HairDisplay.setText("Red");
                        break;
                    }
                    case 6:{
                        HairDisplay.setText("Light Brown");
                        break;
                    }
                    case 7: case 8:{
                        HairDisplay.setText("Brown");
                        break;
                    }
                    case 9:{
                        HairDisplay.setText("Dark Brown");
                        break;
                    }
                    case 10:{
                        HairDisplay.setText("Black");
                        break;
                    }
                }
                // </editor-fold>
                // change to switch case
                if(Weightrand == 1){// <editor-fold>
                    WeightDisplay.setText("105");
                }
                else if(Weightrand == 2 || Weightrand == 3){
                    WeightDisplay.setText("110");
                }
                else if(Weightrand == 4 || Weightrand == 5){
                    WeightDisplay.setText("115");
                }
                else if(Weightrand >= 6 && Weightrand <= 8){
                    WeightDisplay.setText("120");
                }
                else if(Weightrand >=9 && Weightrand <= 12){
                    WeightDisplay.setText("125");
                }
                else if(Weightrand >= 13 && Weightrand <= 17){
                    WeightDisplay.setText("130");
                }
                else if(Weightrand >= 18 && Weightrand <= 22){
                    WeightDisplay.setText("135");
                }
                else if(Weightrand >= 23 && Weightrand <= 29){
                    WeightDisplay.setText("140");
                }
                else if(Weightrand >= 30 && Weightrand <= 37){
                    WeightDisplay.setText("145");
                }
                else if(Weightrand >= 38 && Weightrand <= 49){
                    WeightDisplay.setText("150");
                }
                else if(Weightrand >= 50 && Weightrand <= 64){
                    WeightDisplay.setText("155");
                }
                else if(Weightrand >= 65 && Weightrand <= 71){
                    WeightDisplay.setText("160");
                }
                else if(Weightrand >= 72 && Weightrand <= 78){
                    WeightDisplay.setText("165");
                }
                else if(Weightrand >= 79 && Weightrand <= 83){
                    WeightDisplay.setText("170");
                }
                else if(Weightrand >= 84 && Weightrand <= 88){
                    WeightDisplay.setText("175");
                }
                else if(Weightrand >= 89 && Weightrand <= 92){
                    WeightDisplay.setText("180");
                }
                else if(Weightrand >= 93 && Weightrand <= 95){
                    WeightDisplay.setText("190");
                }
                else if(Weightrand == 96 || Weightrand == 97){
                    WeightDisplay.setText("200");
                }
                else if(Weightrand == 98 && Weightrand == 99){
                    WeightDisplay.setText("210");
                }
                else {
                    WeightDisplay.setText("220");
                }// </editor-fold>
                switch (Eyerand){// <editor-fold>
                    case 1:{
                        EyeDisplay.setText("Pale Grey");
                        break;
                    }
                    case 2:{
                        EyeDisplay.setText("Grey Blue");
                        break;
                    }
                    case 3:{
                        EyeDisplay.setText("Blue");
                        break;
                    }
                    case 4:{
                        EyeDisplay.setText("Green");
                        break;
                    }
                    case 5:{
                        EyeDisplay.setText("Copper");
                        break;
                    }
                    case 6:{
                        EyeDisplay.setText("Light Brown");
                        break;
                    }
                    case 7:{
                        EyeDisplay.setText("Brown");
                        break;
                    }
                    case 8:{
                        EyeDisplay.setText("Dark Brown");
                        break;
                    }
                    case 9:{
                        EyeDisplay.setText("Purple");
                        break;
                    }
                    case 10:{
                        EyeDisplay.setText("Black");
                        break;
                    }
                }// </editor-fold>
                switch (Sibsrand) {
                    case 1: {
                        SiblingsDisplay.setText("0");
                        break;
                    }
                    case 2: case 3: {
                        SiblingsDisplay.setText("1");
                        break;
                    }
                    case 4: case 5: {
                        SiblingsDisplay.setText("2");
                        break;
                    }
                    case 6: case 7: {
                        SiblingsDisplay.setText("3");
                        break;
                    }
                    case 8: case 9: {
                        SiblingsDisplay.setText("4");
                        break;
                    }
                    case 10: {
                        SiblingsDisplay.setText("5");
                        break;
                    }
                }
                switch (Agerand){// <editor-fold>
                    case 1: case 2: case 3: case 4: case 5:{
                        AgeDisplay.setText("16");
                        break;
                    }
                    case 6: case 7: case 8: case 9: case 10:{
                        AgeDisplay.setText("17");
                        break;
                    }
                    case 11: case 12: case 13: case 14: case 15:{
                        AgeDisplay.setText("18");
                        break;
                    }
                    case 16: case 17: case 18: case 19: case 20: {
                        AgeDisplay.setText("19");
                        break;
                    }
                    case 21: case 22: case 23: case 24: case 25: {
                        AgeDisplay.setText("20");
                        break;
                    }
                    case 26: case 27: case 28: case 29: case 30: {
                        AgeDisplay.setText("21");
                        break;
                    }
                    case 31: case 32: case 33: case 34: case 35: {
                        AgeDisplay.setText("22");
                        break;
                    }
                    case 36: case 37: case 38: case 39: case 40: {
                        AgeDisplay.setText("23");
                        break;
                    }
                    case 41: case 42: case 43: case 44: case 45: {
                        AgeDisplay.setText("24");
                        break;
                    }
                    case 46: case 47: case 48: case 49: case 50: {
                        AgeDisplay.setText("25");
                        break;
                    }
                    case 51: case 52: case 53: case 54: case 55: {
                        AgeDisplay.setText("26");
                        break;
                    }
                    case 56: case 57: case 58: case 59: case 60: {
                        AgeDisplay.setText("27");
                        break;
                    }
                    case 61: case 62: case 63: case 64: case 65: {
                        AgeDisplay.setText("28");
                        break;
                    }
                    case 66: case 67: case 68: case 69: case 70: {
                        AgeDisplay.setText("29");
                        break;
                    }
                    case 71: case 72: case 73: case 74: case 75: {
                        AgeDisplay.setText("30");
                        break;
                    }
                    case 76: case 77: case 78: case 79: case 80: {
                        AgeDisplay.setText("31");
                        break;
                    }
                    case 81: case 82: case 83: case 84: case 85: {
                        AgeDisplay.setText("32");
                        break;
                    }
                    case 86: case 87: case 88: case 89: case 90: {
                        AgeDisplay.setText("33");
                        break;
                    }
                    case 91: case 92: case 93: case 94: case 95: {
                        AgeDisplay.setText("34");
                        break;
                    }
                    case 96: case 97: case 98: case 99: case 100: {
                        AgeDisplay.setText("35");
                        break;
                    }
                }// </editor-fold>
                
                switch(FPrand){
                    case 1: case 2: case 3: case 4:{
                        FPRoll.setText("2");
                        break;
                    }
                    case 5: case 6: case 7: case 8: case 9: case 10:{
                        FPRoll.setText("3");
                        break;
                    }
                }
                
                switch(HPrand){
                    case 1: case 2: case 3:{
                        HPRoll.setText("10");
                        break;
                    }
                    case 4: case 5: case 6:{
                        HPRoll.setText("11");
                        break;
                    }
                    case 7: case 8: case 9:{
                        HPRoll.setText("12");
                        break;
                    }
                    case 10:{
                        HPRoll.setText("13");
                        break;
                    }
                }
                
                BirthDisplay.setText(getHuman(birthrand1, birthrand2));
                WSRoll.setText((20 + getRolls()) + "");
                WSRoll.setToolTipText(blah);
                BSRoll.setText((20 + getRolls()) + "");
                BSRoll.setToolTipText(blah);
                StrRoll.setText((20 + getRolls()) + "");
                StrRoll.setToolTipText(blah);
                TRoll.setText((20 + getRolls()) + "");
                TRoll.setToolTipText(blah);
                ARoll.setText((20 + getRolls()) + "");
                ARoll.setToolTipText(blah);
                IntRoll.setText((20 + getRolls()) + "");
                IntRoll.setToolTipText(blah);
                WPRoll.setText((20 + getRolls()) + "");
                WPRoll.setToolTipText(blah);
                FelRoll.setText((20 + getRolls()) + "");
                FelRoll.setToolTipText(blah);
                AttDisplay.setText("1");
                SBDisplay.setText(StrRoll.getText().charAt(0) +"");
                TBDisplay.setText(TRoll.getText().charAt(0) +"");
                MoveDisplay.setText("4");
                MagDisplay.setText("0");
                IPDisplay.setText("0");
                RacialDisplay.setText("Skills: Common Knowledge (the Empire),"
                        + " Gossip, Speak Language (Reikspiel)"
                + '\n'+'\n' + "Talents: 2 random talents" +'\n');
                RacialDisplay.append(getTalents(Raceindex));
                CareerList.setListData(humcareer);
                // in v2 add career compendium careers
                break;
                //</editor-fold>
            }
            case 1: {
                //elf
                //<editor-fold>
                if(Genderindex == 0){
                    HeightDisplay.setText("5'"+(6+Heightrand)+"");
                    // figure out how to roll over the height
                }
                else{
                    HeightDisplay.setText("5'"+(4+Heightrand)+"");
                }
                switch (Hairrand){ // <editor-fold>
                    case 1:{
                        HairDisplay.setText("Silver");
                        break;
                    }
                    case 2:{
                        HairDisplay.setText("Ash Blond");
                        break;
                    }
                    case 3:{
                        HairDisplay.setText("Corn");
                        break;
                    }
                    case 4:{
                        HairDisplay.setText("Yellow");
                        break;
                    }
                    case 5:{
                        HairDisplay.setText("Copper");
                        break;
                    }
                    case 6: case 7:{
                        HairDisplay.setText("Light Brown");
                        break;
                    }
                    case 8:{
                        HairDisplay.setText("Brown");
                        break;
                    }
                    case 9:{
                        HairDisplay.setText("Dark Brown");
                        break;
                    }
                    case 10:{
                        HairDisplay.setText("Black");
                        break;
                    }
                }
                // </editor-fold>
                // change to switch case
                if(Weightrand == 1){// <editor-fold>
                    WeightDisplay.setText("80");
                }
                else if(Weightrand == 2 || Weightrand == 3){
                    WeightDisplay.setText("85");
                }
                else if(Weightrand == 4 || Weightrand == 5){
                    WeightDisplay.setText("90");
                }
                else if(Weightrand >= 6 && Weightrand <= 8){
                    WeightDisplay.setText("95");
                }
                else if(Weightrand >=9 && Weightrand <= 12){
                    WeightDisplay.setText("100");
                }
                else if(Weightrand >= 13 && Weightrand <= 17){
                    WeightDisplay.setText("105");
                }
                else if(Weightrand >= 18 && Weightrand <= 22){
                    WeightDisplay.setText("110");
                }
                else if(Weightrand >= 23 && Weightrand <= 29){
                    WeightDisplay.setText("115");
                }
                else if(Weightrand >= 30 && Weightrand <= 37){
                    WeightDisplay.setText("120");
                }
                else if(Weightrand >= 38 && Weightrand <= 49){
                    WeightDisplay.setText("125");
                }
                else if(Weightrand >= 50 && Weightrand <= 64){
                    WeightDisplay.setText("130");
                }
                else if(Weightrand >= 65 && Weightrand <= 71){
                    WeightDisplay.setText("135");
                }
                else if(Weightrand >= 72 && Weightrand <= 78){
                    WeightDisplay.setText("140");
                }
                else if(Weightrand >= 79 && Weightrand <= 83){
                    WeightDisplay.setText("145");
                }
                else if(Weightrand >= 84 && Weightrand <= 88){
                    WeightDisplay.setText("150");
                }
                else if(Weightrand >= 89 && Weightrand <= 92){
                    WeightDisplay.setText("155");
                }
                else if(Weightrand >= 93 && Weightrand <= 95){
                    WeightDisplay.setText("160");
                }
                else if(Weightrand == 96 || Weightrand == 97){
                    WeightDisplay.setText("165");
                }
                else if(Weightrand == 98 && Weightrand == 99){
                    WeightDisplay.setText("170");
                }
                else {
                    WeightDisplay.setText("175");
                }// </editor-fold>
                switch (Eyerand){// <editor-fold>
                    case 1:{
                        EyeDisplay.setText("Grey Blue");
                        break;
                    }
                    case 2:{
                        EyeDisplay.setText("Blue");
                        break;
                    }
                    case 3:{
                        EyeDisplay.setText("Green");
                        break;
                    }
                    case 4:{
                        EyeDisplay.setText("Copper");
                        break;
                    }
                    case 5:{
                        EyeDisplay.setText("Light Brown");
                        break;
                    }
                    case 6:{
                        EyeDisplay.setText("Brown");
                        break;
                    }
                    case 7:{
                        EyeDisplay.setText("Dark Brown");
                        break;
                    }
                    case 8:{
                        EyeDisplay.setText("Silver");
                        break;
                    }
                    case 9:{
                        EyeDisplay.setText("Purple");
                        break;
                    }
                    case 10:{
                        EyeDisplay.setText("Black");
                        break;
                    }
                }// </editor-fold>
                switch (Sibsrand) {
                    case 1: {
                        SiblingsDisplay.setText("0");
                        break;
                    }
                    case 2: case 3: {
                        SiblingsDisplay.setText("1");
                        break;
                    }
                    case 4: case 5: {
                        SiblingsDisplay.setText("1");
                        break;
                    }
                    case 6: case 7: {
                        SiblingsDisplay.setText("2");
                        break;
                    }
                    case 8: case 9: {
                        SiblingsDisplay.setText("2");
                        break;
                    }
                    case 10: {
                        SiblingsDisplay.setText("3");
                        break;
                    }
                }
                switch (Agerand){// <editor-fold>
                    case 1: case 2: case 3: case 4: case 5:{
                        AgeDisplay.setText("30");
                        break;
                    }
                    case 6: case 7: case 8: case 9: case 10:{
                        AgeDisplay.setText("35");
                        break;
                    }
                    case 11: case 12: case 13: case 14: case 15:{
                        AgeDisplay.setText("40");
                        break;
                    }
                    case 16: case 17: case 18: case 19: case 20: {
                        AgeDisplay.setText("45");
                        break;
                    }
                    case 21: case 22: case 23: case 24: case 25: {
                        AgeDisplay.setText("50");
                        break;
                    }
                    case 26: case 27: case 28: case 29: case 30: {
                        AgeDisplay.setText("55");
                        break;
                    }
                    case 31: case 32: case 33: case 34: case 35: {
                        AgeDisplay.setText("60");
                        break;
                    }
                    case 36: case 37: case 38: case 39: case 40: {
                        AgeDisplay.setText("65");
                        break;
                    }
                    case 41: case 42: case 43: case 44: case 45: {
                        AgeDisplay.setText("70");
                        break;
                    }
                    case 46: case 47: case 48: case 49: case 50: {
                        AgeDisplay.setText("75");
                        break;
                    }
                    case 51: case 52: case 53: case 54: case 55: {
                        AgeDisplay.setText("80");
                        break;
                    }
                    case 56: case 57: case 58: case 59: case 60: {
                        AgeDisplay.setText("85");
                        break;
                    }
                    case 61: case 62: case 63: case 64: case 65: {
                        AgeDisplay.setText("90");
                        break;
                    }
                    case 66: case 67: case 68: case 69: case 70: {
                        AgeDisplay.setText("95");
                        break;
                    }
                    case 71: case 72: case 73: case 74: case 75: {
                        AgeDisplay.setText("100");
                        break;
                    }
                    case 76: case 77: case 78: case 79: case 80: {
                        AgeDisplay.setText("105");
                        break;
                    }
                    case 81: case 82: case 83: case 84: case 85: {
                        AgeDisplay.setText("110");
                        break;
                    }
                    case 86: case 87: case 88: case 89: case 90: {
                        AgeDisplay.setText("115");
                        break;
                    }
                    case 91: case 92: case 93: case 94: case 95: {
                        AgeDisplay.setText("120");
                        break;
                    }
                    case 96: case 97: case 98: case 99: case 100: {
                        AgeDisplay.setText("125");
                        break;
                    }
                }// </editor-fold>
                
                switch(FPrand){
                    case 1: case 2: case 3: case 4:{
                        FPRoll.setText("1");
                        break;
                    }
                    case 5: case 6: case 7: case 8: case 9: case 10:{
                        FPRoll.setText("2");
                        break;
                    }
                }
                
                switch(HPrand){
                    case 1: case 2: case 3:{
                        HPRoll.setText("9");
                        break;
                    }
                    case 4: case 5: case 6:{
                        HPRoll.setText("10");
                        break;
                    }
                    case 7: case 8: case 9:{
                        HPRoll.setText("11");
                        break;
                    }
                    case 10:{
                        HPRoll.setText("12");
                        break;
                    }
                }
                
                if(birthrand3 >= 1 && birthrand3 <= 20){
                    BirthDisplay.setText("City of Altdorf");
                }
                else if (birthrand3 >= 21 && birthrand3 <= 40){
                    BirthDisplay.setText("City of Marienburg");
                }
                else if (birthrand3 >= 41 && birthrand3 <= 70){
                    BirthDisplay.setText("Laurelorn Forest");
                }
                else if (birthrand3 >= 71 && birthrand3 <= 85){
                    BirthDisplay.setText("The Great Forest");
                }
                else {
                    BirthDisplay.setText("Reikwald Forest");
                }
                WSRoll.setText((20 + getRolls()) + "");
                WSRoll.setToolTipText(blah);
                BSRoll.setText((30 + getRolls()) + "");
                BSRoll.setToolTipText(blah);
                StrRoll.setText((20 + getRolls()) + "");
                StrRoll.setToolTipText(blah);
                TRoll.setText((20 + getRolls()) + "");
                TRoll.setToolTipText(blah);
                ARoll.setText((30 + getRolls()) + "");
                ARoll.setToolTipText(blah);
                IntRoll.setText((20 + getRolls()) + "");
                IntRoll.setToolTipText(blah);
                WPRoll.setText((20 + getRolls()) + "");
                WPRoll.setToolTipText(blah);
                FelRoll.setText((20 + getRolls()) + "");
                FelRoll.setToolTipText(blah);
                AttDisplay.setText("1");
                SBDisplay.setText(StrRoll.getText().charAt(0) +"");
                TBDisplay.setText(TRoll.getText().charAt(0) +"");
                MoveDisplay.setText("5");
                MagDisplay.setText("0");
                IPDisplay.setText("0");
                RacialDisplay.setText("Skills: Common Knowledge (Elves),"
                        + " Speak Language (Eltharin), Speak Language (Reikspiel)"
                + '\n'+'\n' + "Talents: Aethyric Attunement or Specialist Weapon Group (Longbow), "
                        + "Coolheaded or Savvy, Execellent Vision, Night Vision" +'\n');
                CareerList.setListData(elfcareer);
                break;
                //</editor-fold>
            }
            case 2: {
                //dwarf
                //<editor-fold>
                if(Genderindex == 0){
                    HeightDisplay.setText("4'"+(4+Heightrand)+"");
                    // figure out how to roll over the height
                }
                else{
                    HeightDisplay.setText("4'"+(2+Heightrand)+"");
                }
                switch (Hairrand){ // <editor-fold>
                    case 1:{
                        HairDisplay.setText("Ash Blond");
                        break;
                    }
                    case 2:{
                        HairDisplay.setText("Yellow");
                        break;
                    }
                    case 3:{
                        HairDisplay.setText("Red");
                        break;
                    }
                    case 4:{
                        HairDisplay.setText("Copper");
                        break;
                    }
                    case 5:{
                        HairDisplay.setText("Light Brown");
                        break;
                    }
                    case 6: case 7:{
                        HairDisplay.setText("Brown");
                        break;
                    }
                    case 8:{
                        HairDisplay.setText("Dark Brown");
                        break;
                    }
                    case 9:{
                        HairDisplay.setText("Blue Black");
                        break;
                    }
                    case 10:{
                        HairDisplay.setText("Black");
                        break;
                    }
                }
                // </editor-fold>
                // change to switch case
                if(Weightrand == 1){// <editor-fold>
                    WeightDisplay.setText("90");
                }
                else if(Weightrand == 2 || Weightrand == 3){
                    WeightDisplay.setText("95");
                }
                else if(Weightrand == 4 || Weightrand == 5){
                    WeightDisplay.setText("100");
                }
                else if(Weightrand >= 6 && Weightrand <= 8){
                    WeightDisplay.setText("105");
                }
                else if(Weightrand >=9 && Weightrand <= 12){
                    WeightDisplay.setText("110");
                }
                else if(Weightrand >= 13 && Weightrand <= 17){
                    WeightDisplay.setText("115");
                }
                else if(Weightrand >= 18 && Weightrand <= 22){
                    WeightDisplay.setText("120");
                }
                else if(Weightrand >= 23 && Weightrand <= 29){
                    WeightDisplay.setText("125");
                }
                else if(Weightrand >= 30 && Weightrand <= 37){
                    WeightDisplay.setText("130");
                }
                else if(Weightrand >= 38 && Weightrand <= 49){
                    WeightDisplay.setText("135");
                }
                else if(Weightrand >= 50 && Weightrand <= 64){
                    WeightDisplay.setText("140");
                }
                else if(Weightrand >= 65 && Weightrand <= 71){
                    WeightDisplay.setText("145");
                }
                else if(Weightrand >= 72 && Weightrand <= 78){
                    WeightDisplay.setText("150");
                }
                else if(Weightrand >= 79 && Weightrand <= 83){
                    WeightDisplay.setText("155");
                }
                else if(Weightrand >= 84 && Weightrand <= 88){
                    WeightDisplay.setText("160");
                }
                else if(Weightrand >= 89 && Weightrand <= 92){
                    WeightDisplay.setText("165");
                }
                else if(Weightrand >= 93 && Weightrand <= 95){
                    WeightDisplay.setText("170");
                }
                else if(Weightrand == 96 || Weightrand == 97){
                    WeightDisplay.setText("175");
                }
                else if(Weightrand == 98 && Weightrand == 99){
                    WeightDisplay.setText("180");
                }
                else {
                    WeightDisplay.setText("185");
                }// </editor-fold>
                switch (Eyerand){// <editor-fold>
                    case 1:{
                        EyeDisplay.setText("Pale Grey");
                        break;
                    }
                    case 2:{
                        EyeDisplay.setText("Blue");
                        break;
                    }
                    case 3:{
                        EyeDisplay.setText("Copper");
                        break;
                    }
                    case 4: case 5:{
                        EyeDisplay.setText("Light Brown");
                        break;
                    }
                    case 6: case 7:{
                        EyeDisplay.setText("Brown");
                        break;
                    }
                    case 8: case 9:{
                        EyeDisplay.setText("Dark Brown");
                        break;
                    }
                    case 10:{
                        EyeDisplay.setText("Purple");
                        break;
                    }
                }// </editor-fold>
                switch (Sibsrand) {
                    case 1: case 2: case 3: {
                        SiblingsDisplay.setText("0");
                        break;
                    }
                    case 4: case 5: case 6: case 7: {
                        SiblingsDisplay.setText("1");
                        break;
                    }
                    case 8: case 9: {
                        SiblingsDisplay.setText("2");
                        break;
                    }
                    case 10: {
                        SiblingsDisplay.setText("3");
                        break;
                    }
                }
                switch (Agerand){// <editor-fold>
                    case 1: case 2: case 3: case 4: case 5:{
                        AgeDisplay.setText("20");
                        break;
                    }
                    case 6: case 7: case 8: case 9: case 10:{
                        AgeDisplay.setText("25");
                        break;
                    }
                    case 11: case 12: case 13: case 14: case 15:{
                        AgeDisplay.setText("30");
                        break;
                    }
                    case 16: case 17: case 18: case 19: case 20: {
                        AgeDisplay.setText("35");
                        break;
                    }
                    case 21: case 22: case 23: case 24: case 25: {
                        AgeDisplay.setText("40");
                        break;
                    }
                    case 26: case 27: case 28: case 29: case 30: {
                        AgeDisplay.setText("45");
                        break;
                    }
                    case 31: case 32: case 33: case 34: case 35: {
                        AgeDisplay.setText("50");
                        break;
                    }
                    case 36: case 37: case 38: case 39: case 40: {
                        AgeDisplay.setText("55");
                        break;
                    }
                    case 41: case 42: case 43: case 44: case 45: {
                        AgeDisplay.setText("60");
                        break;
                    }
                    case 46: case 47: case 48: case 49: case 50: {
                        AgeDisplay.setText("65");
                        break;
                    }
                    case 51: case 52: case 53: case 54: case 55: {
                        AgeDisplay.setText("70");
                        break;
                    }
                    case 56: case 57: case 58: case 59: case 60: {
                        AgeDisplay.setText("75");
                        break;
                    }
                    case 61: case 62: case 63: case 64: case 65: {
                        AgeDisplay.setText("80");
                        break;
                    }
                    case 66: case 67: case 68: case 69: case 70: {
                        AgeDisplay.setText("85");
                        break;
                    }
                    case 71: case 72: case 73: case 74: case 75: {
                        AgeDisplay.setText("90");
                        break;
                    }
                    case 76: case 77: case 78: case 79: case 80: {
                        AgeDisplay.setText("95");
                        break;
                    }
                    case 81: case 82: case 83: case 84: case 85: {
                        AgeDisplay.setText("100");
                        break;
                    }
                    case 86: case 87: case 88: case 89: case 90: {
                        AgeDisplay.setText("105");
                        break;
                    }
                    case 91: case 92: case 93: case 94: case 95: {
                        AgeDisplay.setText("110");
                        break;
                    }
                    case 96: case 97: case 98: case 99: case 100: {
                        AgeDisplay.setText("115");
                        break;
                    }
                }// </editor-fold>
                
                switch(FPrand){
                    case 1: case 2: case 3: case 4:{
                        FPRoll.setText("1");
                        break;
                    }
                    case 5: case 6: case 7: {
                        FPRoll.setText("2");
                        break;
                    }
                    case 8: case 9: case 10:{
                        FPRoll.setText("3");
                        break;
                    }
                }
                
                switch(HPrand){
                    case 1: case 2: case 3:{
                        HPRoll.setText("11");
                        break;
                    }
                    case 4: case 5: case 6:{
                        HPRoll.setText("12");
                        break;
                    }
                    case 7: case 8: case 9:{
                        HPRoll.setText("13");
                        break;
                    }
                    case 10:{
                        HPRoll.setText("14");
                        break;
                    }
                }
                
                if (birthrand3 >= 1 && birthrand3 <= 30){
                    BirthDisplay.setText(getHuman(birthrand1, birthrand2));
                }
                else if (birthrand3 >= 31 && birthrand3 <= 40){
                    BirthDisplay.setText("Karak Norn (Grey Mountains)");
                }
                else if (birthrand3 >= 41 && birthrand3 <= 50){
                    BirthDisplay.setText("Karak Izor (the Vaults)");
                }
                else if (birthrand3 >= 51 && birthrand3 <= 60){
                    BirthDisplay.setText("Karak Hirn (Black Mountains)");
                }
                else if (birthrand3 >= 61 && birthrand3 <= 70){
                    BirthDisplay.setText("Karak Kadrin (World's Edge Mountains)");
                }
                else if (birthrand3 >= 71 && birthrand3 <= 80){
                    BirthDisplay.setText("Karaz-A-Karak (World's Edge Mountains)");
                }
                else if (birthrand3 >= 81 && birthrand3 <= 90){
                    BirthDisplay.setText("Zhufbar (World's Edge Mountains)");
                }
                else {
                    BirthDisplay.setText("Barak Varr (the Black Gulf)");
                }
                WSRoll.setText((30 + getRolls()) + "");
                WSRoll.setToolTipText(blah);
                BSRoll.setText((20 + getRolls()) + "");
                BSRoll.setToolTipText(blah);
                StrRoll.setText((20 + getRolls()) + "");
                StrRoll.setToolTipText(blah);
                TRoll.setText((30 + getRolls()) + "");
                TRoll.setToolTipText(blah);
                ARoll.setText((10 + getRolls()) + "");
                ARoll.setToolTipText(blah);
                IntRoll.setText((20 + getRolls()) + "");
                IntRoll.setToolTipText(blah);
                WPRoll.setText((20 + getRolls()) + "");
                WPRoll.setToolTipText(blah);
                FelRoll.setText((10 + getRolls()) + "");
                FelRoll.setToolTipText(blah);
                AttDisplay.setText("1");
                SBDisplay.setText(StrRoll.getText().charAt(0) +"");
                TBDisplay.setText(TRoll.getText().charAt(0) +"");
                MoveDisplay.setText("3");
                MagDisplay.setText("0");
                IPDisplay.setText("0");
                RacialDisplay.setText("Skills: Common Knowledge (Dwarfs),"
                        + " Speak Language (Khazzalid), Speak Language (Reikspiel), "
                        + "Trade (Miner, Smith, or Stoneworker)"
                + '\n'+'\n' + "Talents: Dwarfcraft, Grudge-born Fury, Night Vision, "
                        + "Resistance to Magic, Stout-hearted, Sturdy" +'\n');
                //RacialDisplay.append(getTalents(Raceindex));
                CareerList.setListData(dwarfcareer);
                break;
                //</editor-fold>
            }
            case 3: {
                //halfling
                //<editor-fold>
                if(Genderindex == 0){
                    HeightDisplay.setText("3'"+(4+Heightrand)+"");
                    // figure out how to roll over the height
                }
                else{
                    HeightDisplay.setText("3'"+(2+Heightrand)+"");
                }
                switch (Hairrand){ // <editor-fold>
                    case 1:{
                        HairDisplay.setText("Ash Blond");
                        break;
                    }
                    case 2:{
                        HairDisplay.setText("Corn");
                        break;
                    }
                    case 3: case 4: {
                        HairDisplay.setText("Yellow");
                        break;
                    }
                    case 5:{
                        HairDisplay.setText("Copper");
                        break;
                    }
                    case 6:{
                        HairDisplay.setText("Red");
                        break;
                    }
                    case 7:{
                        HairDisplay.setText("Light Brown");
                        break;
                    }
                    case 8:{
                        HairDisplay.setText("Brown");
                        break;
                    }
                    case 9:{
                        HairDisplay.setText("Dark Brown");
                        break;
                    }
                    case 10:{
                        HairDisplay.setText("Black");
                        break;
                    }
                }
                // </editor-fold>
                // change to switch case
                // <editor-fold>
                if(Weightrand == 1 && Weightrand == 3){
                    WeightDisplay.setText("75");
                }
                else if(Weightrand == 4 && Weightrand == 5){
                    WeightDisplay.setText("80");
                }
                else if(Weightrand >= 6 && Weightrand <= 8){
                    WeightDisplay.setText("80");
                }
                else if(Weightrand >=9 && Weightrand <= 12){
                    WeightDisplay.setText("85");
                }
                else if(Weightrand >= 13 && Weightrand <= 17){
                    WeightDisplay.setText("85");
                }
                else if(Weightrand >= 18 && Weightrand <= 22){
                    WeightDisplay.setText("90");
                }
                else if(Weightrand >= 23 && Weightrand <= 29){
                    WeightDisplay.setText("90");
                }
                else if(Weightrand >= 30 && Weightrand <= 37){
                    WeightDisplay.setText("95");
                }
                else if(Weightrand >= 38 && Weightrand <= 49){
                    WeightDisplay.setText("100");
                }
                else if(Weightrand >= 50 && Weightrand <= 64){
                    WeightDisplay.setText("100");
                }
                else if(Weightrand >= 65 && Weightrand <= 71){
                    WeightDisplay.setText("105");
                }
                else if(Weightrand >= 72 && Weightrand <= 78){
                    WeightDisplay.setText("110");
                }
                else if(Weightrand >= 79 && Weightrand <= 83){
                    WeightDisplay.setText("115");
                }
                else if(Weightrand >= 84 && Weightrand <= 88){
                    WeightDisplay.setText("120");
                }
                else if(Weightrand >= 89 && Weightrand <= 92){
                    WeightDisplay.setText("125");
                }
                else if(Weightrand >= 93 && Weightrand <= 95){
                    WeightDisplay.setText("130");
                }
                else if(Weightrand == 96 || Weightrand == 97){
                    WeightDisplay.setText("135");
                }
                else if(Weightrand == 98 && Weightrand == 99){
                    WeightDisplay.setText("140");
                }
                else {
                    WeightDisplay.setText("145");
                }// </editor-fold>
                switch (Eyerand){// <editor-fold>
                    case 1:{
                        EyeDisplay.setText("Blue");
                        break;
                    }
                    case 2: case 3: {
                        EyeDisplay.setText("Hazel");
                        break;
                    }
                    case 4: case 5: {
                        EyeDisplay.setText("Light Brown");
                        break;
                    }
                    case 6: case 7:{
                        EyeDisplay.setText("Brown");
                        break;
                    }
                    case 8: case 9: case 10: {
                        EyeDisplay.setText("Dark Brown");
                        break;
                    }
                }// </editor-fold>
                switch (Sibsrand) {
                    case 1: {
                        SiblingsDisplay.setText("1");
                        break;
                    }
                    case 2: case 3: {
                        SiblingsDisplay.setText("2");
                        break;
                    }
                    case 4: case 5: {
                        SiblingsDisplay.setText("3");
                        break;
                    }
                    case 6: case 7: {
                        SiblingsDisplay.setText("4");
                        break;
                    }
                    case 8: case 9: {
                        SiblingsDisplay.setText("5");
                        break;
                    }
                    case 10: {
                        SiblingsDisplay.setText("6");
                        break;
                    }
                }
                switch (Agerand){// <editor-fold>
                    case 1: case 2: case 3: case 4: case 5:{
                        AgeDisplay.setText("20");
                        break;
                    }
                    case 6: case 7: case 8: case 9: case 10:{
                        AgeDisplay.setText("22");
                        break;
                    }
                    case 11: case 12: case 13: case 14: case 15:{
                        AgeDisplay.setText("24");
                        break;
                    }
                    case 16: case 17: case 18: case 19: case 20: {
                        AgeDisplay.setText("26");
                        break;
                    }
                    case 21: case 22: case 23: case 24: case 25: {
                        AgeDisplay.setText("28");
                        break;
                    }
                    case 26: case 27: case 28: case 29: case 30: {
                        AgeDisplay.setText("30");
                        break;
                    }
                    case 31: case 32: case 33: case 34: case 35: {
                        AgeDisplay.setText("32");
                        break;
                    }
                    case 36: case 37: case 38: case 39: case 40: {
                        AgeDisplay.setText("34");
                        break;
                    }
                    case 41: case 42: case 43: case 44: case 45: {
                        AgeDisplay.setText("36");
                        break;
                    }
                    case 46: case 47: case 48: case 49: case 50: {
                        AgeDisplay.setText("38");
                        break;
                    }
                    case 51: case 52: case 53: case 54: case 55: {
                        AgeDisplay.setText("40");
                        break;
                    }
                    case 56: case 57: case 58: case 59: case 60: {
                        AgeDisplay.setText("42");
                        break;
                    }
                    case 61: case 62: case 63: case 64: case 65: {
                        AgeDisplay.setText("44");
                        break;
                    }
                    case 66: case 67: case 68: case 69: case 70: {
                        AgeDisplay.setText("46");
                        break;
                    }
                    case 71: case 72: case 73: case 74: case 75: {
                        AgeDisplay.setText("50");
                        break;
                    }
                    case 76: case 77: case 78: case 79: case 80: {
                        AgeDisplay.setText("52");
                        break;
                    }
                    case 81: case 82: case 83: case 84: case 85: {
                        AgeDisplay.setText("54");
                        break;
                    }
                    case 86: case 87: case 88: case 89: case 90: {
                        AgeDisplay.setText("56");
                        break;
                    }
                    case 91: case 92: case 93: case 94: case 95: {
                        AgeDisplay.setText("58");
                        break;
                    }
                    case 96: case 97: case 98: case 99: case 100: {
                        AgeDisplay.setText("60");
                        break;
                    }
                }// </editor-fold>
                
                switch(FPrand){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: {
                        FPRoll.setText("2");
                        break;
                    }
                    case 8: case 9: case 10:{
                        FPRoll.setText("3");
                        break;
                    }
                }
                
                switch(HPrand){
                    case 1: case 2: case 3:{
                        HPRoll.setText("8");
                        break;
                    }
                    case 4: case 5: case 6:{
                        HPRoll.setText("9");
                        break;
                    }
                    case 7: case 8: case 9:{
                        HPRoll.setText("10");
                        break;
                    }
                    case 10:{
                        HPRoll.setText("11");
                        break;
                    }
                }
                if (birthrand3 >= 1 && birthrand3 <= 50){
                    BirthDisplay.setText("The Moot");
                }
                else{
                    BirthDisplay.setText(getHuman(birthrand1, birthrand2));
                }
                WSRoll.setText((10 + getRolls()) + "");
                WSRoll.setToolTipText(blah);
                BSRoll.setText((30 + getRolls()) + "");
                BSRoll.setToolTipText(blah);
                StrRoll.setText((10 + getRolls()) + "");
                StrRoll.setToolTipText(blah);
                TRoll.setText((10 + getRolls()) + "");
                TRoll.setToolTipText(blah);
                ARoll.setText((30 + getRolls()) + "");
                ARoll.setToolTipText(blah);
                IntRoll.setText((20 + getRolls()) + "");
                IntRoll.setToolTipText(blah);
                WPRoll.setText((20 + getRolls()) + "");
                WPRoll.setToolTipText(blah);
                FelRoll.setText((30 + getRolls()) + "");
                FelRoll.setToolTipText(blah);
                AttDisplay.setText("1");
                SBDisplay.setText(StrRoll.getText().charAt(0) +"");
                TBDisplay.setText(TRoll.getText().charAt(0) +"");
                MoveDisplay.setText("4");
                MagDisplay.setText("0");
                IPDisplay.setText("0");
                RacialDisplay.setText("Skills: Academic Knowledge (Genealogy/Heraldry),"
                        + " Common Knowledge (Halflings), Gossip, Speak Language (Reikspiel), "
                        + "Speak Language (Halfling), Trade (Cook or Farmer)"
                + '\n'+'\n' + "Talents: Night Vision, Resistance to Chaos, "
                        + "Specialist Weapon Group (Sling), 1 random talents" +'\n');
                RacialDisplay.append(getTalents(Raceindex));
                CareerList.setListData(halfcareer);
                break;
                //</editor-fold>
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CareerListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_CareerListValueChanged
        // TODO add your handling code here:
        String d = CareerList.getSelectedValue().toString();
        jLabel22.setText(d);
        String [] parts;
        
        //For talents see if I can do a list and then iterate over a switch to fill in the talent descriptions
        //Maybe even have Talent descriptions as a seperate display
        
        switch(d){
            case "Agitator":{
                Fluff.setText(lore.get(d));
                tablePop(advance.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                break;
            }
            case "Apprentice Wizard":{
                //System.out.println(lore.get(d));
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                /*
                jTable1.setValueAt("-", 0, 0);
                jTable1.setValueAt("-", 0, 1);
                jTable1.setValueAt("-", 0, 2);
                jTable1.setValueAt("-", 0, 3);
                jTable1.setValueAt("5%", 0, 4);
                jTable1.setValueAt("10%", 0, 5);
                jTable1.setValueAt("15%", 0, 6);
                jTable1.setValueAt("5%", 0, 7);
                jTable2.setValueAt("-", 0, 0);
                jTable2.setValueAt("+2", 0, 1);
                jTable2.setValueAt("-", 0, 2);
                jTable2.setValueAt("-", 0, 3);
                jTable2.setValueAt("-", 0, 4);
                jTable2.setValueAt("+1", 0, 5);
                jTable2.setValueAt("-", 0, 6);
                jTable2.setValueAt("-", 0, 7);
                */
                break;
            }
            case "Bailiff":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Barber-Surgeon":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Boatman":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Bodyguard":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Bone Picker":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Bounty Hunter":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Burgher":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Camp Follower":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Charcoal-Burner":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Coachman":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Entertainer":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Envoy":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Estalian Diestro":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Ferryman":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Fieldwarden":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Fisherman":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Grave Robber":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Hedge Wizard":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Hunter":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Initiate":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Jailer":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Kislevite Kossar":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Kithband Warrior":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Marine":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Mercenary":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Messenger":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Militiaman":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Miner":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Noble":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Norse Berserker":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Outlaw":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Outrider":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Peasant":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Pit Fighter":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Protagonist":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Rat Catcher":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Roadwarden":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Rogue":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Runebearer":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Scribe":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Seaman":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Servant":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Shieldbreaker":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Smuggler":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Soldier":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Squire":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Student":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Thief":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Thug":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Toll Keeper":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Tomb Robber":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Tradesman":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Troll Slayer":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Vagabond":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Valet":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Watchman":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Woodsman":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            case "Zealot":{
                Fluff.setText(lore.get(d));
                Skills.setText(skill.get(d));
                Talent.setText(talent.get(d)+'\n'+'\n'+getDiscript(tallist.get(d)));
                Trap.setText(trap.get(d));
                EntExt.setText(sepEntExt(entext.get(d)));
                tablePop(advance.get(d));
                break;
            }
            default:{
                    Fluff.setText("Tired of typing");
                    break;
                    }
        }
    }//GEN-LAST:event_CareerListValueChanged

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String args[]) throws FileNotFoundException, IOException {
        
        int thing = 0;
        int moo = 0;
        /*
        ArrayList<String> bap = new ArrayList<String>(
        Arrays.asList(advanced,careers,entexts,skillz,talents,talexplained,tallists,trappingz));
        */
        while(moo < 8){
            switch(thing){
                case 0:{
                    advanced myObj = new advanced();
                    for(String w : myObj.x){
                        String[] holdin = w.split(":");
                        advance.put(holdin[0],holdin[1]);
                    }
                    thing++;
                    break;
                }
                case 1:{
                    careers myObj = new careers();
                    for(String w : myObj.x){
                        String[] holdin = w.split(":");
                        lore.put(holdin[0],holdin[1]);
                    }
                    thing++;
                    break;
                }
                case 2:{
                    entexts myObj = new entexts();
                    for(String w : myObj.x){
                        String[] holdin = w.split(":",2);
                        entext.put(holdin[0],holdin[1]);
                    }
                    thing++;
                    break;
                }
                case 3:{
                    skillz myObj = new skillz();
                    for(String w : myObj.x){
                        String[] holdin = w.split(":");
                        skill.put(holdin[0],holdin[1]);
                    }
                    thing++;
                    break;
                }
                case 4:{
                    talents myObj = new talents();
                    for(String w : myObj.x){
                        String[] holdin = w.split(":");
                        talent.put(holdin[0],holdin[1]);
                    }
                    thing++;
                    break;
                }
                case 5:{
                    talexplained myObj = new talexplained();
                    for(String w : myObj.x){
                        String[] holdin = w.split(":");
                        taldis.put(holdin[0],holdin[1]);
                    }
                    thing++;
                    break;
                }
                case 6:{
                    tallists myObj = new tallists();
                    for(String w : myObj.x){
                        String[] holdin = w.split(":");
                        tallist.put(holdin[0],holdin[1]);
                    }
                    thing++;
                    break;
                }
                case 7:{
                    trappingz myObj = new trappingz();
                    for(String w : myObj.x){
                        String[] holdin = w.split(":");
                        trap.put(holdin[0],holdin[1]);
                    }
                    thing++;
                    break;
                }
            }
            moo++;
        }
        
        //advanced myObj = new advanced();
        /*
        System.out.println(myObj.x[1]);
        for(String w : myObj.x){
            String[] holdin = w.split(":");
            System.out.println(holdin[0]);
            System.out.println(holdin[1]);
            advance.put(holdin[0],holdin[1]);
            
        }
        */
        /*
        int counter = 0;
        // but make sure you replace these 
        ArrayList<String> files = new ArrayList<String>(
        Arrays.asList("C:/Users/Baby_/Documents/NetBeansProjects/GUIFormExamples/src/examples/folder/career.txt",
                "C:/Users/Baby_/Documents/NetBeansProjects/GUIFormExamples/src/examples/folder/entext.txt",
                "C:/Users/Baby_/Documents/NetBeansProjects/GUIFormExamples/src/examples/folder/skills.txt",
                "C:/Users/Baby_/Documents/NetBeansProjects/GUIFormExamples/src/examples/folder/talent.txt",
                "C:/Users/Baby_/Documents/NetBeansProjects/GUIFormExamples/src/examples/folder/trappings.txt",
                "C:/Users/Baby_/Documents/NetBeansProjects/GUIFormExamples/src/examples/folder/talexplain.txt",
                "C:/Users/Baby_/Documents/NetBeansProjects/GUIFormExamples/src/examples/folder/tallist.txt",
                "C:/Users/Baby_/Documents/NetBeansProjects/GUIFormExamples/src/examples/folder/advance.txt"));
        
        for(String file : files){
            //System.out.println(file);
            counter++;
            //System.out.println(counter);
            String filePath = file;
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(":",2);
                if (parts.length >= 2){
                    String key = parts[0];
                    String value = parts[1];
                    switch (counter){
                        case 1:{
                            lore.put(key, value);
                            break;
                        }
                        case 2:{
                            entext.put(key,value);
                            break;
                        }
                        case 3:{
                            skill.put(key, value);
                            break;
                        }
                        case 4:{
                            talent.put(key, value);
                            break;
                        }
                        case 5:{
                            trap.put(key, value);
                            break;
                        }
                        case 6:{
                            taldis.put(key,value);
                            break;
                        }
                        case 7:{
                            tallist.put(key, value);
                            break;
                        }
                        case 8:{
                            //advance.put(key, value);
                            break;
                        }
                    }
                } else{
                    System.out.println("Baa");
                }
            }
        }
        */
        /*
        String filePath = "C:/Users/Baby_/Documents/NetBeansProjects/GUIFormExamples/src/examples/folder/career.txt";
        //HashMap<String, String> lore = new HashMap<String, String>();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null){
            String[] parts = line.split(":",2);
            if (parts.length >= 2){
                String key = parts[0];
                String value = parts[1];
                lore.put(key, value);
            } else{
                System.out.println("Baa");
            }
        }
        */
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WarhamerGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WarhamerGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WarhamerGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WarhamerGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WarhamerGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ARoll;
    private javax.swing.JTextField AgeDisplay;
    private javax.swing.JTextField AttDisplay;
    private javax.swing.JTextField BSRoll;
    private javax.swing.JTextField BirthDisplay;
    private javax.swing.JList CareerList;
    private javax.swing.JRadioButton DoubleRoll;
    private javax.swing.JTextArea EntExt;
    private javax.swing.JLabel EyeColor;
    private javax.swing.JTextField EyeDisplay;
    private javax.swing.JTextField FPRoll;
    private javax.swing.JTextField FelRoll;
    private javax.swing.JTextArea Fluff;
    private javax.swing.JList Gender;
    private javax.swing.JTextField HPRoll;
    private javax.swing.JLabel HairColor;
    private javax.swing.JTextField HairDisplay;
    private javax.swing.JLabel Height;
    private javax.swing.JTextField HeightDisplay;
    private javax.swing.JTextField IPDisplay;
    private javax.swing.JTextField IntRoll;
    private javax.swing.JTextField MagDisplay;
    private javax.swing.JTextField MarksDisplay;
    private javax.swing.JTextField MoveDisplay;
    private javax.swing.JList Race;
    private javax.swing.JTextArea RacialDisplay;
    private javax.swing.JTextField SBDisplay;
    private javax.swing.JTextField SiblingsDisplay;
    private javax.swing.JTextField SigDisplay;
    private javax.swing.JTextArea Skills;
    private javax.swing.JTextField StarDisplay;
    private javax.swing.JTextField StrRoll;
    private javax.swing.JTextField TBDisplay;
    private javax.swing.JTextField TRoll;
    private javax.swing.JTextArea Talent;
    private javax.swing.JTextArea Trap;
    private javax.swing.JScrollPane Trappings;
    private javax.swing.JTextField WPRoll;
    private javax.swing.JTextField WSRoll;
    private javax.swing.JLabel Weight;
    private javax.swing.JTextField WeightDisplay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
