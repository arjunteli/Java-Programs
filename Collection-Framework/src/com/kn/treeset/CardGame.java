//package com.kn.treeset;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class CardGame extends JFrame {
//    private Player user;
//    private Player computer;
//    private DefaultListModel<String> userCardListModel;
//    private DefaultListModel<String> computerCardListModel;
//    private JList<String> userCardList;
//    private JList<String> computerCardList;
//    private JLabel userScoreLabel;
//    private JLabel computerScoreLabel;
//
//    public CardGame() {
//        super("Card Game");
//        user = new Player("User");
//        computer = new Player("Computer");
//
//        // Set up UI components
//        userCardListModel = new DefaultListModel<>();
//        computerCardListModel = new DefaultListModel<>();
//        userCardList = new JList<>(userCardListModel);
//        computerCardList = new JList<>(computerCardListModel);
//        userScoreLabel = new JLabel("User Score: 0");
//        computerScoreLabel = new JLabel("Computer Score: 0");
//        JButton playButton = new JButton("Play Round");
//
//        // Add action listener to the play button
//        playButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                playRound();
//            }
//        });
//
//        // Set up layout
//        setLayout(new BorderLayout());
//        JPanel scorePanel = new JPanel();
//        scorePanel.add(userScoreLabel);
//        scorePanel.add(computerScoreLabel);
//        add(scorePanel, BorderLayout.NORTH);
//
//        JPanel cardPanel = new JPanel(new GridLayout(1, 2));
//        cardPanel.add(new JScrollPane(userCardList));
//        cardPanel.add(new JScrollPane(computerCardList));
//        add(cardPanel, BorderLayout.CENTER);
//
//        add(playButton, BorderLayout.SOUTH);
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pack();
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    private void playRound() {
//        // Simulate a round of the card game
//        user.reset();
//        computer.reset();
//
//        for (int i = 0; i < 5; i++) {
//            user.drawCard();
//            computer.drawCard();
//        }
//
//        // Update UI with scores
//        userScoreLabel.setText("User Score: " + user.getScore());
//        computerScoreLabel.setText("Computer Score: " + computer.getScore());
//
//        // Update UI with drawn cards
//        updateCardList(userCardListModel, user.getHand(), user.getName());
//        updateCardList(computerCardListModel, computer.getHand(), computer.getName());
//
//        // Determine the winner of the round
//        String roundWinner = determineRoundWinner();
//        JOptionPane.showMessageDialog(this, "Round Winner: " + roundWinner);
//
//        // Ask the user if they want to continue
//        int option = JOptionPane.showConfirmDialog(this, "Do you want to continue?", "Continue?", JOptionPane.YES_NO_OPTION);
//        if (option == JOptionPane.NO_OPTION) {
//            System.exit(0);
//        }
//    }
//
//    private void updateCardList(DefaultListModel<String> model, ArrayList<Integer> hand, String playerName) {
//        model.clear();
//        for (int card : hand) {
//            model.addElement(playerName + ": " + card);
//        }
//    }
//
//    private String determineRoundWinner() {
//		return null;
//        // The same as before
//        // ...
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new CardGame();
//            }
//        });
//    }
//}





