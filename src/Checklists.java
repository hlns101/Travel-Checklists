import javax.swing.*;
import java.awt.*;

public class Checklists extends JFrame {
    Checklists() {

        // Main Menu
        JPanel mainMenu = new JPanel();
        mainMenu.setLayout(new BoxLayout(mainMenu, BoxLayout.PAGE_AXIS));

        // These work as a filler to create spacing
        mainMenu.add(Box.createRigidArea(new Dimension(40, 80)));

        JLabel menuTitle = new JLabel("Travel Checklists");
        menuTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        menuTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainMenu.add(menuTitle);

        mainMenu.add(Box.createRigidArea(new Dimension(10, 30)));

        // Adding the options to the panel

        JButton documentsButton = new JButton("Carried Documents/Essentials") {
            {
                setSize(300, 50);
                setMaximumSize(getSize());
            }
        };

        /* How I figured out how to set the size of a button as setSize() or setPreferredSize() wasn't working :
        https://stackoverflow.com/questions/15394741/resize-jbuttons-in-a-boxlayout
         */

        documentsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainMenu.add(documentsButton);
        mainMenu.add(Box.createRigidArea(new Dimension(10, 10)));


        JButton itemsButton = new JButton ("Other items to bring"){
            {
                setSize(300, 50);
                setMaximumSize(getSize());
            }
        };

        itemsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainMenu.add(itemsButton);
        mainMenu.add(Box.createRigidArea(new Dimension(10, 10)));


        JButton questsButton = new JButton("Side Quests"){
            {
                setSize(300, 50);
                setMaximumSize(getSize());
            }
        };
        questsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainMenu.add(questsButton);

        mainMenu.add(Box.createRigidArea(new Dimension(10, 10)));
        JButton exitButton = new JButton("Exit"){
            {
                setSize(300, 50);
                setMaximumSize(getSize());
            }
        };

        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainMenu.add(exitButton);

        // Adding main menu panel to the frame
        add(mainMenu);

        // Documents Panel
        // A new panel and layout manager for the documents checklist
        JPanel documentsPanel = new JPanel();
        GridBagLayout documentsLayout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        documentsPanel.setLayout(documentsLayout);

        JLabel documentsTitle = new JLabel("Carried Documents/Essentials");
        documentsTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        c.fill = GridBagConstraints.PAGE_START;
        c.gridwidth = 4;
        c.insets = new Insets(10, 10, 10, 10);
        documentsPanel.add(documentsTitle, c);

        JCheckBox document1 = new JCheckBox("Plane Ticket");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 1;
        c.gridx = 0;
        c.gridwidth = 3;
        documentsPanel.add(document1, c);

        JCheckBox document2 = new JCheckBox("Passport");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 1;
        c.gridx = 3;
        documentsPanel.add(document2, c);

        JCheckBox document3 = new JCheckBox("IDs");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 2;
        c.gridx = 0;
        documentsPanel.add(document3, c);

        JCheckBox document4 = new JCheckBox("Travel Itineraries");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 2;
        c.gridx = 3;
        documentsPanel.add(document4, c);

        JCheckBox document5 = new JCheckBox("Visa (if needed)");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 3;
        c.gridx = 0;
        documentsPanel.add(document5, c);

        JCheckBox document6 = new JCheckBox("Drivers License");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 3;
        c.gridx = 3;
        documentsPanel.add(document6, c);

        JCheckBox document7 = new JCheckBox("Event Tickets");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 4;
        c.gridx = 0;
        documentsPanel.add(document7, c);

        JCheckBox document8 = new JCheckBox("Cash");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 4;
        c.gridx = 3;
        documentsPanel.add(document8, c);

        JCheckBox document9 = new JCheckBox("Credit/debit cards");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 5;
        c.gridx = 0;
        documentsPanel.add(document9, c);

        JCheckBox document10 = new JCheckBox("Other certificates (if needed)");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 5;
        c.gridx = 3;
        documentsPanel.add(document10, c);

        JButton documentsBack = new JButton("Back");
        c.fill = GridBagConstraints.LINE_END;
        c.gridy = 10;
        c.gridx = 5;
        documentsPanel.add(documentsBack, c);


        // Items Panel
        JPanel itemsPanel = new JPanel();
        GridBagLayout checklistLayout = new GridBagLayout();
        itemsPanel.setLayout(checklistLayout);

        // Title
        JLabel itemsTitle = new JLabel("Travel Checklist");
        itemsTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        c.fill = GridBagConstraints.PAGE_START;
        c.gridwidth = 2;
        c.insets = new Insets(10, 5, 5, 5);

        // First column
        // checkboxes
        JCheckBox item1 = new JCheckBox("Phone/Other devices w/ chargers");
        c.fill = GridBagConstraints.LINE_START;
        c.gridx = 0;
        c.gridy = 0;

        JCheckBox item2 = new JCheckBox("Universal adapter");
        c.weightx = 0.5;
        c.gridy = GridBagConstraints.RELATIVE;

        JCheckBox item3 = new JCheckBox("Portable charger");
        JCheckBox item4 = new JCheckBox("Outfits");
        JCheckBox item5 = new JCheckBox("Umbrella");
        JCheckBox item6 = new JCheckBox("Reusable water bottle");
        JCheckBox item7 = new JCheckBox("Earplugs");
        JCheckBox item8 = new JCheckBox("Headphones");
        JCheckBox item9 = new JCheckBox("Eye mask");
        JCheckBox item10 = new JCheckBox("Socks");

        // Adding the items in the first column
        itemsPanel.add(itemsTitle, c);
        itemsPanel.add(item1, c);
        itemsPanel.add(item2, c);
        itemsPanel.add(item3, c);
        itemsPanel.add(item4, c);
        itemsPanel.add(item5, c);
        itemsPanel.add(item6, c);
        itemsPanel.add(item7, c);
        itemsPanel.add(item8, c);
        itemsPanel.add(item9, c);
        itemsPanel.add(item10, c);

        // Next column
        JCheckBox item11 = new JCheckBox("Sweaters/Scarfs/Blankets");
        c.gridx = 4;
        c.gridy = 1;
        itemsPanel.add(item11, c);

        JCheckBox item12 = new JCheckBox("Sunglasses");
        c.gridy = GridBagConstraints.RELATIVE;
        itemsPanel.add(item12,c);

        JCheckBox item13 = new JCheckBox("Swimsuits");
        itemsPanel.add(item13,c);

        JCheckBox item14 = new JCheckBox("Neck pillow");
        itemsPanel.add(item14, c);

        JCheckBox item15 = new JCheckBox("Travel kits/cases");
        itemsPanel.add(item15, c);

        JCheckBox item16 = new JCheckBox("Lip balm");
        itemsPanel.add(item16, c);

        JCheckBox item17 = new JCheckBox("Skin care");
        itemsPanel.add(item17, c);

        JCheckBox item18 = new JCheckBox("Hair care");
        itemsPanel.add(item18, c);

        JCheckBox item19 = new JCheckBox("Teeth care and other hygiene/health items");
        itemsPanel.add(item19, c);

        JButton itemsBack = new JButton("Back");
        c.fill = GridBagConstraints.LINE_END;
        itemsPanel.add(itemsBack, c);


        // Side Quests panel
        JPanel sideQuests = new JPanel();
        GridBagLayout questsLayout = new GridBagLayout();
        sideQuests.setLayout(questsLayout);


        JLabel questsTitle = new JLabel ("Side Quests");
        questsTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        c.fill = GridBagConstraints.PAGE_START;
        c.gridwidth = 0;
        c.insets = new Insets(10, 5, 0, 0);
        sideQuests.add(questsTitle, c);

        JCheckBox quest1 = new JCheckBox("Take photos of birds/other animals");
        c.fill = GridBagConstraints.LINE_START;
        // Add this c.weighty to add space in between the heights of the quests
        //c.weighty = 0.1;
        c.gridx = 0;
        c.gridy = 1;
        sideQuests.add(quest1, c);

        JCheckBox quest2 = new JCheckBox("Try a new food/drink");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 2;
        sideQuests.add(quest2, c);

        JCheckBox quest3 = new JCheckBox("Buy new things like souvenirs");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 3;
        sideQuests.add(quest3, c);

        JCheckBox quest4 = new JCheckBox("Go biking");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 4;
        sideQuests.add(quest4, c);

        JCheckBox quest5 = new JCheckBox("See places there that you've seen in shows/movies/etc.");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 5;
        sideQuests.add(quest5, c);

        JCheckBox quest6 = new JCheckBox("Take a walk in a park");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 6;
        sideQuests.add(quest6, c);

        JCheckBox quest7 = new JCheckBox("Try a new activity");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 7;
        sideQuests.add(quest7, c);

        JCheckBox quest8 = new JCheckBox("Visit places with a great view of the city");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 8;
        sideQuests.add(quest8, c);

        JCheckBox quest9 = new JCheckBox("Visit museums/art murals");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 9;
        sideQuests.add(quest9, c);

        JButton questsBack = new JButton("Back");
        c.fill = GridBagConstraints.RELATIVE;
        c.gridy = 10;
        sideQuests.add(questsBack, c);


        // To make the buttons to go to a certain page once clicked

        documentsButton.addActionListener(e -> {
            mainMenu.setVisible(false);
            documentsPanel.setVisible(true);
            add(documentsPanel);
        });

        itemsButton.addActionListener(e -> {
            mainMenu.setVisible(false);
            itemsPanel.setVisible(true);
            add(itemsPanel);

        });

        questsButton.addActionListener(e -> {
            mainMenu.setVisible(false);
            sideQuests.setVisible(true);
            add(sideQuests);
        });

        // Exit

        exitButton.addActionListener(e -> System.exit(0));

        // The back buttons

        documentsBack.addActionListener(e -> {
            documentsPanel.setVisible(false);
            mainMenu.setVisible(true);
            add(mainMenu);
        });


        itemsBack.addActionListener(e -> {
            itemsPanel.setVisible(false);
            mainMenu.setVisible(true);
            add(mainMenu);
            validate();

        });

        questsBack.addActionListener(e -> {
            sideQuests.setVisible(false);
            mainMenu.setVisible(true);
            add(mainMenu);
            validate();

        });

    }

    public static void main (String[] args){
        Checklists frame = new Checklists();
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}