package hospital.window;

import javax.swing.*;
import javax.swing.table.*;

import java.awt.Dimension;
import java.awt.Toolkit.*;
import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.*;
import com.toedter.calendar.*;

import hospital.Impl.Delete;
import hospital.Impl.Insert;
import hospital.Impl.Select;

import java.awt.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class HomePage extends JFrame {

	private JPanel activityPanel;
	private JButton addDoctorButton;
	private JPanel addDoctorPanel;
	private JButton addPatientButton;
	private JPanel addPatientPanel;
	private JButton addTreatmentButton;
	private JPanel addTreatmentPanel;
	private JLabel addressDispLabel;
	private JLabel addressLabel;
	private JScrollPane addressScrollPane;
	private JTextArea addressTextArea;
	private JLabel consultingFeeLabel;
	private JTextField consultingFeeTextField;
	private JLabel contactDispLabel;
	private JDateChooser dateChooser;
	private JButton delPatientCancelDeleteButton;
	private JButton delPatientConfirmDischargeButton;
	private JPanel delPatientDetailsPanel;
	private JButton delPatientFindButton;
	private JLabel delPatientIdLabel;
	private JTextField delPatientIdTextField;
	private JButton dischargePatientButton;
	private JPanel dischargePatientPanel;
	private JButton displayAllButton;
	private JLabel dobDispLabel;
	private JLabel dobLabel;
	private JLabel doctorContactNoLabel;
	private JTextField doctorContactNoTextField;
	private JLabel doctorIdLabel;
	private JTextField doctorIdTextField;
	private JLabel doctorNameLabel;
	private JTextField doctorNameTextField;
	private JRadioButton femaleRadioButton;
	private JButton homeButton;
	private JPanel homePanel;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JPanel jPanel1;
	private JPanel mainPanel;
	private JRadioButton maleRadioButton;
	private JPanel menuPanel;
	private JLabel nameDispLabel;
	private JLabel orLabel;
	private JLabel patientContactNoLabel;
	private JTextField patientContactNoTextField;
	private JLabel patientIdSearchLabel;
	private JTextField patientIdSearchTextField;
	private JTextField patientIdTextField;
	private JLabel patientNameLabel;
	private JLabel patientNameSearchLabel;
	private JTextField patientNameSearchTextField;
	private JTextField patientNameTextField;
	private JLabel patientidLabel;
	private JLabel prescriptionLabel;
	private JScrollPane prescriptionScrollPane;
	private JTextArea prescriptionTextArea;
	private JTable resultTable;
	private JScrollPane resultTableScrollPane;
	private JButton saveDoctorButton;
	private JButton savepatientButton;
	private JButton savetreatmentButton;
	private JButton searchButton;
	private JPanel searchPanel;
	private JPanel searchResultPanel;
	private JButton searchUsingIdButton;
	private JLabel searchUsingLabel;
	private JButton searchUsingNameButton;
	private JLabel sexLabel;
	private JLabel specializationLabel;
	private JTextField specializationTextField;
	private JLabel title;

	public HomePage() {
		initComponents();

		Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
		int iCoordX = (objDimension.width - this.getWidth()) / 2;
		int iCoordY = (objDimension.height - this.getHeight()) / 2;
		this.setLocation(iCoordX, iCoordY);

		ButtonGroup gender = new ButtonGroup();
		gender.add(maleRadioButton);
		gender.add(femaleRadioButton);

	}

	private void initComponents() {

		mainPanel = new JPanel();
		menuPanel = new JPanel();
		homeButton = new JButton();
		addPatientButton = new JButton();
		addTreatmentButton = new JButton();
		dischargePatientButton = new JButton();
		searchButton = new JButton();
		addDoctorButton = new JButton();
		activityPanel = new JPanel();
		homePanel = new JPanel();
		title = new JLabel();
		jPanel1 = new JPanel();
		addPatientPanel = new JPanel();
		patientNameLabel = new JLabel();
		dobLabel = new JLabel();
		sexLabel = new JLabel();
		addressLabel = new JLabel();
		patientContactNoLabel = new JLabel();
		patientNameTextField = new JTextField();
		dateChooser = new JDateChooser();
		patientContactNoTextField = new JTextField();
		savepatientButton = new JButton();
		addressScrollPane = new JScrollPane();
		addressTextArea = new JTextArea();
		maleRadioButton = new JRadioButton();
		femaleRadioButton = new JRadioButton();
		addTreatmentPanel = new JPanel();
		doctorIdLabel = new JLabel();
		doctorIdTextField = new JTextField();
		patientidLabel = new JLabel();
		patientIdTextField = new JTextField();
		prescriptionLabel = new JLabel();
		prescriptionScrollPane = new JScrollPane();
		prescriptionTextArea = new JTextArea();
		savetreatmentButton = new JButton();
		dischargePatientPanel = new JPanel();
		delPatientIdLabel = new JLabel();
		delPatientIdTextField = new JTextField();
		delPatientFindButton = new JButton();
		delPatientDetailsPanel = new JPanel();
		delPatientConfirmDischargeButton = new JButton();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		nameDispLabel = new JLabel();
		dobDispLabel = new JLabel();
		addressDispLabel = new JLabel();
		contactDispLabel = new JLabel();
		delPatientCancelDeleteButton = new JButton();
		searchPanel = new JPanel();
		patientNameSearchLabel = new JLabel();
		patientNameSearchTextField = new JTextField();
		patientIdSearchLabel = new JLabel();
		patientIdSearchTextField = new JTextField();
		searchResultPanel = new JPanel();
		resultTableScrollPane = new JScrollPane();
		resultTable = new JTable();
		addDoctorPanel = new JPanel();
		searchUsingNameButton = new JButton();
		displayAllButton = new JButton();
		saveDoctorButton = new JButton();
		searchUsingIdButton = new JButton();
		doctorNameTextField = new JTextField();
		specializationTextField = new JTextField();
		doctorContactNoTextField = new JTextField();
		consultingFeeTextField = new JTextField();
		orLabel = new JLabel();
		specializationLabel = new JLabel();
		doctorNameLabel = new JLabel();
		doctorContactNoLabel = new JLabel();
		consultingFeeLabel = new JLabel();
		searchUsingLabel = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		homeButton.setText("Home");
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				homeButtonActionPerformed(evt);
			}
		});

		addPatientButton.setText("Add Patient");
		addPatientButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				addPatientButtonActionPerformed(evt);
			}
		});

		addTreatmentButton.setText("Add Treatment");
		addTreatmentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				addTreatmentButtonActionPerformed(evt);
			}
		});

		dischargePatientButton.setText("Discharge patient");
		dischargePatientButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				dischargePatientButtonActionPerformed(evt);
			}
		});

		searchButton.setText("Search Patient");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				searchButtonActionPerformed(evt);
			}
		});

		addDoctorButton.setText("Add Doctor");
		addDoctorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				addDoctorButtonActionPerformed(evt);
			}
		});
		
		// MENU PANEL
		GroupLayout menuPanelLayout = new GroupLayout(menuPanel);
		menuPanelLayout.setHorizontalGroup(
			menuPanelLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(menuPanelLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(menuPanelLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(menuPanelLayout.createSequentialGroup()
							.addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(addPatientButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(addTreatmentButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(addDoctorButton)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(searchButton))
						.addComponent(dischargePatientButton))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		menuPanelLayout.setVerticalGroup(
			menuPanelLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(menuPanelLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(menuPanelLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(homeButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(addPatientButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(addTreatmentButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(addDoctorButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(searchButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(dischargePatientButton)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		menuPanel.setLayout(menuPanelLayout);

		activityPanel.setLayout(new CardLayout());

		title.setFont(new java.awt.Font("Courier New", 1, 30));
		title.setText(" HOSPITAL MUNTENIA ");

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 534, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 294, Short.MAX_VALUE));

		
		//HOME PANEL 
	
		GroupLayout homePanelLayout = new GroupLayout(homePanel);
		homePanelLayout.setHorizontalGroup(
			homePanelLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
				.addGroup(homePanelLayout.createSequentialGroup()
					.addGap(89)
					.addComponent(title, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(93, Short.MAX_VALUE))
		);
		homePanelLayout.setVerticalGroup(
			homePanelLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(homePanelLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(title, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		homePanel.setLayout(homePanelLayout);

		activityPanel.add(homePanel, "card2");

		patientNameLabel.setText("Name ");

		dobLabel.setText("Date of birth");

		sexLabel.setText("Sex");

		addressLabel.setText("address");

		patientContactNoLabel.setText("mobile num.");

		dateChooser.setDateFormatString("yyyy-MM-dd ");
		dateChooser.setMaxSelectableDate(new Date(1000000L));
		dateChooser.setMinSelectableDate(new Date(-1000000L));

		savepatientButton.setText("SAVE");
		savepatientButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				savepatientButtonActionPerformed(evt);
			}
		});

		addressTextArea.setColumns(20);
		addressTextArea.setLineWrap(true);
		addressTextArea.setRows(5);
		addressTextArea.setName(""); 
		addressTextArea.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evt) {
				addressTextAreaKeyPressed(evt);
			}
		});
		addressScrollPane.setViewportView(addressTextArea);

		maleRadioButton.setText("Male");

		femaleRadioButton.setText("Female");
		
		// INSERT PATIENT PANEL
		GroupLayout addPatientPanelLayout = new GroupLayout(addPatientPanel);
		addPatientPanel.setLayout(addPatientPanelLayout);
		addPatientPanelLayout.setHorizontalGroup(addPatientPanelLayout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(addPatientPanelLayout.createSequentialGroup().addContainerGap().addGroup(addPatientPanelLayout
						.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(GroupLayout.Alignment.LEADING, addPatientPanelLayout.createSequentialGroup()
								.addComponent(patientContactNoLabel, GroupLayout.PREFERRED_SIZE, 71,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(patientContactNoTextField, GroupLayout.PREFERRED_SIZE, 129,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(GroupLayout.Alignment.LEADING,
								addPatientPanelLayout.createSequentialGroup().addGroup(addPatientPanelLayout
										.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
										.addComponent(patientNameLabel, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
										.addComponent(sexLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(patientNameTextField, GroupLayout.PREFERRED_SIZE, 163,
												GroupLayout.PREFERRED_SIZE))
						.addGroup(GroupLayout.Alignment.LEADING, addPatientPanelLayout
								.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(savepatientButton, GroupLayout.PREFERRED_SIZE, 152,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(addPatientPanelLayout.createSequentialGroup()
										.addGroup(addPatientPanelLayout
												.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
												.addComponent(addressLabel, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(dobLabel, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(
												addPatientPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 129,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(addPatientPanelLayout.createSequentialGroup()
																.addComponent(maleRadioButton).addGap(10, 10, 10)
																.addComponent(femaleRadioButton))
														.addComponent(addressScrollPane, GroupLayout.PREFERRED_SIZE,
																296, GroupLayout.PREFERRED_SIZE)))))
						.addContainerGap(153, Short.MAX_VALUE)));
		addPatientPanelLayout.setVerticalGroup(addPatientPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(addPatientPanelLayout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(addPatientPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(patientNameLabel, GroupLayout.PREFERRED_SIZE, 19,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(patientNameTextField, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(addPatientPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(sexLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addGroup(addPatientPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(maleRadioButton).addComponent(femaleRadioButton)))
						.addGap(5, 5, 5)
						.addGroup(addPatientPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(dobLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(14, 14, 14)
						.addGroup(addPatientPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(addressLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(addressScrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(addPatientPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(patientContactNoLabel, GroupLayout.PREFERRED_SIZE, 24,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(patientContactNoTextField, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(32, 32, 32)
						.addComponent(savepatientButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		activityPanel.add(addPatientPanel, "card2");

		doctorIdLabel.setText("Doctor id");

		patientidLabel.setText("Patient id ");

		prescriptionLabel.setText("Prescription ");

		prescriptionTextArea.setColumns(20);
		prescriptionTextArea.setRows(5);
		prescriptionTextArea.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evt) {
				prescriptionTextAreaKeyPressed(evt);
			}
		});
		prescriptionScrollPane.setViewportView(prescriptionTextArea);

		savetreatmentButton.setText("SAVE");
		savetreatmentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				savetreatmentButtonActionPerformed(evt);
			}
		});
		
		
		// TRATAMENT PANEL
		GroupLayout addTreatmentPanelLayout = new GroupLayout(addTreatmentPanel);
		addTreatmentPanel.setLayout(addTreatmentPanelLayout);
		addTreatmentPanelLayout.setHorizontalGroup(addTreatmentPanelLayout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(addTreatmentPanelLayout.createSequentialGroup().addContainerGap()
						.addGroup(addTreatmentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(savetreatmentButton, GroupLayout.PREFERRED_SIZE, 152,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(addTreatmentPanelLayout.createSequentialGroup()
										.addGroup(addTreatmentPanelLayout
												.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
												.addComponent(prescriptionLabel, GroupLayout.DEFAULT_SIZE, 68,
														Short.MAX_VALUE)
												.addComponent(patientidLabel, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(doctorIdLabel, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(addTreatmentPanelLayout
												.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(addTreatmentPanelLayout
														.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addComponent(doctorIdTextField, GroupLayout.PREFERRED_SIZE,
																126, GroupLayout.PREFERRED_SIZE)
														.addComponent(patientIdTextField,
																GroupLayout.Alignment.TRAILING,
																GroupLayout.PREFERRED_SIZE, 126,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(prescriptionScrollPane, GroupLayout.PREFERRED_SIZE, 315,
														GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(137, Short.MAX_VALUE)));
		addTreatmentPanelLayout.setVerticalGroup(addTreatmentPanelLayout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(addTreatmentPanelLayout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(addTreatmentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(doctorIdLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(doctorIdTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(addTreatmentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(patientIdTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(patientidLabel, GroupLayout.PREFERRED_SIZE, 23,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(addTreatmentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(prescriptionLabel, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(prescriptionScrollPane, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(savetreatmentButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(155, Short.MAX_VALUE)));

		activityPanel.add(addTreatmentPanel, "card2");

		delPatientIdLabel.setText("Patient ID");

		delPatientFindButton.setText("FIND");
		delPatientFindButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				delPatientFindButtonActionPerformed(evt);
			}
		});

		delPatientDetailsPanel.addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent evt) {
				delPatientDetailsPanelComponentShown(evt);
			}
		});

		delPatientConfirmDischargeButton.setText("Confirm Discharge");
		delPatientConfirmDischargeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				delPatientConfirmDischargeButtonActionPerformed(evt);
			}
		});

		jLabel4.setText("Name");

		jLabel5.setText("birth date");

		jLabel6.setText("Address");

		jLabel7.setText("mobile nr.");

		delPatientCancelDeleteButton.setText("Cancel");
		delPatientCancelDeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				delPatientCancelDeleteButtonActionPerformed(evt);
			}
		});
		
		// DELETE PATIENT PANEL
		GroupLayout delPatientDetailsPanelLayout = new GroupLayout(delPatientDetailsPanel);
		delPatientDetailsPanel.setLayout(delPatientDetailsPanelLayout);
		delPatientDetailsPanelLayout.setHorizontalGroup(delPatientDetailsPanelLayout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(delPatientDetailsPanelLayout.createSequentialGroup().addContainerGap()
						.addGroup(delPatientDetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(delPatientDetailsPanelLayout.createSequentialGroup()
										.addGroup(delPatientDetailsPanelLayout
												.createParallelGroup(GroupLayout.Alignment.LEADING, false)
												.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(delPatientDetailsPanelLayout
												.createParallelGroup(GroupLayout.Alignment.LEADING, false)
												.addComponent(nameDispLabel, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(dobDispLabel, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(contactDispLabel, GroupLayout.PREFERRED_SIZE, 152,
														GroupLayout.PREFERRED_SIZE)))
								.addGroup(delPatientDetailsPanelLayout.createSequentialGroup()
										.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 67,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(addressDispLabel, GroupLayout.PREFERRED_SIZE, 227,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(delPatientDetailsPanelLayout.createSequentialGroup().addGap(88, 88, 88)
										.addComponent(delPatientConfirmDischargeButton).addGap(18, 18, 18)
										.addComponent(delPatientCancelDeleteButton, GroupLayout.PREFERRED_SIZE, 92,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(207, Short.MAX_VALUE)));
		delPatientDetailsPanelLayout.setVerticalGroup(delPatientDetailsPanelLayout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, delPatientDetailsPanelLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(delPatientDetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel4).addComponent(nameDispLabel, GroupLayout.Alignment.TRAILING,
										GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(delPatientDetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dobDispLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(delPatientDetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel7).addComponent(contactDispLabel, GroupLayout.PREFERRED_SIZE, 14,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(delPatientDetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(delPatientDetailsPanelLayout.createSequentialGroup().addComponent(jLabel6)
										.addGap(72, 72, 72)
										.addGroup(delPatientDetailsPanelLayout
												.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(delPatientConfirmDischargeButton,
														GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
												.addComponent(delPatientCancelDeleteButton, GroupLayout.PREFERRED_SIZE,
														32, GroupLayout.PREFERRED_SIZE)))
								.addComponent(addressDispLabel, GroupLayout.PREFERRED_SIZE, 20,
										GroupLayout.PREFERRED_SIZE))
						.addGap(34, 126, Short.MAX_VALUE)));
		
		// DISCHARGE PATIENT PANEL
		GroupLayout dischargePatientPanelLayout = new GroupLayout(dischargePatientPanel);
		dischargePatientPanel.setLayout(dischargePatientPanelLayout);
		dischargePatientPanelLayout.setHorizontalGroup(dischargePatientPanelLayout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(dischargePatientPanelLayout.createSequentialGroup().addContainerGap()
						.addGroup(dischargePatientPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(delPatientFindButton)
								.addGroup(dischargePatientPanelLayout.createSequentialGroup()
										.addComponent(delPatientIdLabel, GroupLayout.PREFERRED_SIZE, 71,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(delPatientIdTextField, GroupLayout.PREFERRED_SIZE, 110,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(339, Short.MAX_VALUE))
				.addComponent(delPatientDetailsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		dischargePatientPanelLayout.setVerticalGroup(dischargePatientPanelLayout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(dischargePatientPanelLayout.createSequentialGroup().addContainerGap()
						.addGroup(dischargePatientPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(delPatientIdLabel, GroupLayout.PREFERRED_SIZE, 23,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(delPatientIdTextField, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18).addComponent(delPatientFindButton)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(delPatientDetailsPanel,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		activityPanel.add(dischargePatientPanel, "card2");

		patientNameSearchLabel.setText("Patient Name");

		patientIdSearchLabel.setText("Patient ID");

		searchResultPanel.addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent evt) {
				searchResultPanelComponentShown(evt);
			}
		});
		searchResultPanel.setLayout(new BorderLayout());

		resultTable.setModel(new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		resultTableScrollPane.setViewportView(resultTable);

		searchResultPanel.add(resultTableScrollPane, BorderLayout.CENTER);

		searchUsingLabel.setText("Search by using :");

		searchUsingNameButton.setText("Name");
		searchUsingNameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				searchUsingNameButtonActionPerformed(evt);
			}
		});

		searchUsingIdButton.setText("ID");
		searchUsingIdButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				searchUsingIdButtonActionPerformed(evt);
			}
		});

		orLabel.setText("OR");

		displayAllButton.setText("Display ALL");
		displayAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				displayAllButtonActionPerformed(evt);
			}
		});
		
		
		// SEARCH PANEL
		GroupLayout searchPanelLayout = new GroupLayout(searchPanel);
		searchPanel.setLayout(searchPanelLayout);
		searchPanelLayout.setHorizontalGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(searchResultPanel, GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
				.addGroup(searchPanelLayout.createSequentialGroup().addContainerGap().addGroup(searchPanelLayout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(searchPanelLayout.createSequentialGroup()
								.addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(patientIdSearchLabel, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(patientNameSearchLabel, GroupLayout.DEFAULT_SIZE, 76,
												Short.MAX_VALUE))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(patientNameSearchTextField, GroupLayout.DEFAULT_SIZE, 128,
												Short.MAX_VALUE)
										.addComponent(patientIdSearchTextField)))
						.addGroup(searchPanelLayout.createSequentialGroup()
								.addComponent(searchUsingLabel, GroupLayout.PREFERRED_SIZE, 107,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(searchUsingNameButton, GroupLayout.PREFERRED_SIZE, 73,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(searchUsingIdButton, GroupLayout.PREFERRED_SIZE, 66,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(orLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(displayAllButton)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		searchPanelLayout.setVerticalGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(searchPanelLayout.createSequentialGroup().addContainerGap()
						.addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(patientNameSearchLabel, GroupLayout.PREFERRED_SIZE, 23,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(patientNameSearchTextField, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(patientIdSearchLabel, GroupLayout.PREFERRED_SIZE, 23,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(patientIdSearchTextField, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(searchUsingNameButton).addComponent(searchUsingIdButton)
								.addComponent(searchUsingLabel).addComponent(orLabel).addComponent(displayAllButton))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
						.addComponent(searchResultPanel, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)));

		activityPanel.add(searchPanel, "card2");

		doctorNameLabel.setText("Name");

		specializationLabel.setText("Specialization");

		doctorContactNoLabel.setText("mobile nr.");

		saveDoctorButton.setText("SAVE");
		saveDoctorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				saveDoctorButtonActionPerformed(evt);
			}
		});

		consultingFeeLabel.setText("consulting price ( Lei. )");

		// INSERT DOCTOR PANEL
		GroupLayout addDoctorPanelLayout = new GroupLayout(addDoctorPanel);
		addDoctorPanel.setLayout(addDoctorPanelLayout);
		addDoctorPanelLayout.setHorizontalGroup(addDoctorPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(addDoctorPanelLayout.createSequentialGroup().addContainerGap().addGroup(addDoctorPanelLayout
						.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(saveDoctorButton, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
						.addGroup(addDoctorPanelLayout.createSequentialGroup()
								.addGroup(addDoctorPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(consultingFeeLabel, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(doctorContactNoLabel, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(specializationLabel, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(
												doctorNameLabel, GroupLayout.PREFERRED_SIZE, 113,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(addDoctorPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(doctorNameTextField, GroupLayout.PREFERRED_SIZE, 163,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(addDoctorPanelLayout
												.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
												.addComponent(consultingFeeTextField, GroupLayout.Alignment.LEADING)
												.addComponent(doctorContactNoTextField, GroupLayout.Alignment.LEADING)
												.addComponent(specializationTextField, GroupLayout.Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)))))
						.addContainerGap(244, Short.MAX_VALUE)));
		addDoctorPanelLayout.setVerticalGroup(addDoctorPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(addDoctorPanelLayout.createSequentialGroup().addContainerGap()
						.addGroup(addDoctorPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(doctorNameLabel, GroupLayout.PREFERRED_SIZE, 19,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(doctorNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(addDoctorPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(specializationLabel, GroupLayout.PREFERRED_SIZE, 19,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(specializationTextField, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(addDoctorPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(doctorContactNoLabel, GroupLayout.PREFERRED_SIZE, 24,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(doctorContactNoTextField, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(addDoctorPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(consultingFeeLabel, GroupLayout.PREFERRED_SIZE, 24,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(consultingFeeTextField, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(32, 32, 32)
						.addComponent(saveDoctorButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(198, Short.MAX_VALUE)));
		activityPanel.add(addDoctorPanel, "card2");
		
		
		//MAIN PANEL
		GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
		mainPanel.setLayout(mainPanelLayout);
		mainPanelLayout.setHorizontalGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(menuPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(GroupLayout.Alignment.TRAILING,
						mainPanelLayout.createSequentialGroup().addContainerGap().addComponent(activityPanel,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		mainPanelLayout.setVerticalGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(mainPanelLayout.createSequentialGroup()
						.addComponent(menuPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(25, 25, 25).addComponent(activityPanel, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(mainPanel,
				GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(mainPanel,
				GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}

	private void homeButtonActionPerformed(ActionEvent evt) {
		// removing old panel
		activityPanel.removeAll();
		activityPanel.repaint();
		activityPanel.revalidate();

		// adding the new panel
		activityPanel.add(homePanel);
		activityPanel.repaint();
		activityPanel.revalidate();

	}

	private void addPatientButtonActionPerformed(ActionEvent evt) {
		// removing old panel
		activityPanel.removeAll();
		activityPanel.repaint();
		activityPanel.revalidate();

		// adding the new panel
		activityPanel.add(addPatientPanel);
		activityPanel.repaint();
		activityPanel.revalidate();

	}

	private void addTreatmentButtonActionPerformed(ActionEvent evt) {
		// removing old panel
		activityPanel.removeAll();
		activityPanel.repaint();
		activityPanel.revalidate();

		// adding the new panel
		activityPanel.add(addTreatmentPanel);
		activityPanel.repaint();
		activityPanel.revalidate();
	}

	private void dischargePatientButtonActionPerformed(ActionEvent evt) {
		// removing old panel
		activityPanel.removeAll();
		activityPanel.repaint();
		activityPanel.revalidate();

		// adding the new panel
		activityPanel.add(dischargePatientPanel);
		activityPanel.repaint();
		activityPanel.revalidate();
		delPatientDetailsPanel.setVisible(false);

	}

	private void searchButtonActionPerformed(ActionEvent evt) {
		// removing old panel
		activityPanel.removeAll();
		activityPanel.repaint();
		activityPanel.revalidate();

		// adding the new panel
		activityPanel.add(searchPanel);
		activityPanel.repaint();
		activityPanel.revalidate();
		searchResultPanel.setVisible(false);

	}

	private void savepatientButtonActionPerformed(ActionEvent evt) {
		String name, sex, dob, address, contact = "";

		name = patientNameTextField.getText();
		if (name.equals("")) {
			JOptionPane.showMessageDialog(null, "Name cannot be left empty!", "Error", JOptionPane.WARNING_MESSAGE);
			return;
		}

		if (maleRadioButton.isSelected()) {
			sex = "Male";
		} else if (femaleRadioButton.isSelected()) {
			sex = "Female";
		} else {
			JOptionPane.showMessageDialog(null, "Sex cannot be left empty!", "Error", JOptionPane.WARNING_MESSAGE);
			return;
		}

		dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		if (dob.equals("")) {
			JOptionPane.showMessageDialog(null, "Date cannot be left empty!", "Error", JOptionPane.WARNING_MESSAGE);
			return;
		}

		address = addressTextArea.getText();
		if (address.equals("")) {
			JOptionPane.showMessageDialog(null, "address cannot be left empty!", "Error", JOptionPane.WARNING_MESSAGE);
			return;
		}

		contact = patientContactNoTextField.getText();

		if (contact.equals("")) {
			JOptionPane.showMessageDialog(null, "Contact No. cannot be left empty!", "Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		try {
			Insert.InsertPatient(name, sex, dob, address, contact);
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	@SuppressWarnings("deprecation")
	private void addressTextAreaKeyPressed(KeyEvent evt) {
		if (evt.getKeyCode() == KeyEvent.VK_TAB) {
			if (evt.getModifiers() > 0) {
				addressTextArea.transferFocusBackward();
			} else {
				addressTextArea.transferFocus();
			}
			evt.consume();
		}
	}

	private void savetreatmentButtonActionPerformed(ActionEvent evt) {

		int doctorId;
		if (doctorIdTextField.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Doctor ID cannot be left empty!", "Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		try {
			doctorId = parseInt(doctorIdTextField.getText());
		} catch (NumberFormatException e) // if it is not an integer
		{
			JOptionPane.showMessageDialog(null, "Doctor ID  must be a number !", "Error", JOptionPane.WARNING_MESSAGE);
			return;
		}

		int patientId;
		if (patientIdTextField.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Patient ID cannot be left empty!", "Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		try {
			patientId = parseInt(patientIdTextField.getText());
		} catch (NumberFormatException e) // daca nu este int
		{
			JOptionPane.showMessageDialog(null, "Patient ID  must be a number !", "Error", JOptionPane.WARNING_MESSAGE);
			return;
		}
		String prescription = prescriptionTextArea.getText();
		if (prescription.equals("")) {
			JOptionPane.showMessageDialog(null, "Prescription cannot be left empty!", "Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		try {
			Insert.InsertTreatment(doctorId, patientId, prescription);
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	private void addDoctorButtonActionPerformed(ActionEvent evt) {
		// removing old panel
		activityPanel.removeAll();
		activityPanel.repaint();
		activityPanel.revalidate();

		// adding the new panel
		activityPanel.add(addDoctorPanel);
		activityPanel.repaint();
		activityPanel.revalidate();

	}

	@SuppressWarnings("deprecation")
	private void prescriptionTextAreaKeyPressed(KeyEvent evt) {
		if (evt.getKeyCode() == KeyEvent.VK_TAB) {
			if (evt.getModifiers() > 0) {
				prescriptionTextArea.transferFocusBackward();
			} else {
				prescriptionTextArea.transferFocus();
			}
			evt.consume();
		}
	}

	private void saveDoctorButtonActionPerformed(ActionEvent evt) {

		String doctorName = doctorNameTextField.getText();
		if (doctorName.equals("")) {
			JOptionPane.showMessageDialog(null, "Name cannot be left empty!", "Error", JOptionPane.WARNING_MESSAGE);
			return;
		}

		String specialization = specializationTextField.getText();
		if (specialization.equals("")) {
			JOptionPane.showMessageDialog(null, "Specialization cannot be left empty!", "Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		String doctorContactNo = doctorContactNoTextField.getText();
		if (doctorContactNo.equals("")) {
			JOptionPane.showMessageDialog(null, "Contact No. cannot be left empty!", "Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		int consultingFee;
		if (consultingFeeTextField.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Consulting Fee cannot be left empty!", "Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		try {
			consultingFee = parseInt(consultingFeeTextField.getText());
		} catch (NumberFormatException e) // if it is not an integer
		{
			JOptionPane.showMessageDialog(null, "Consulting fee must be a number !", "Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		try {
			Insert.InsertDoctor(doctorName, specialization, doctorContactNo, consultingFee);
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	private void delPatientFindButtonActionPerformed(ActionEvent evt) {

		int delPatientId;
		if (delPatientIdTextField.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Patient ID cannot be left empty!", "Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		try {
			delPatientId = parseInt(delPatientIdTextField.getText());
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Patient ID must be a number ! ", "Error", JOptionPane.WARNING_MESSAGE);
			return;
		}

		ArrayList<String> foundPatient = null;
		try {
			foundPatient = Select.searchPatientById(delPatientId);
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
		}
		if (foundPatient != null) {
			nameDispLabel.setText(foundPatient.get(1));
			dobDispLabel.setText(foundPatient.get(3));
			addressDispLabel.setText(foundPatient.get(4));
			contactDispLabel.setText(foundPatient.get(5));
			delPatientDetailsPanel.setVisible(true);
		} else {
			delPatientIdTextField.setText("");
		}

	}

	private void delPatientConfirmDischargeButtonActionPerformed(ActionEvent evt) {

		int delPatientId = parseInt(delPatientIdTextField.getText());

		try {
			Delete.deletePatient(delPatientId);
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	private void delPatientDetailsPanelComponentShown(ComponentEvent evt) {
	}

	private void delPatientCancelDeleteButtonActionPerformed(ActionEvent evt) {
		// removing old panel
		activityPanel.removeAll();
		activityPanel.repaint();
		activityPanel.revalidate();

		// adding the new panel
		activityPanel.add(dischargePatientPanel);
		activityPanel.repaint();
		activityPanel.revalidate();

		delPatientIdTextField.setText("");
		delPatientDetailsPanel.setVisible(false);
	}

	private void searchUsingNameButtonActionPerformed(ActionEvent evt) {

		String patientName = patientNameSearchTextField.getText();
		if (patientName.equals("")) {
			JOptionPane.showMessageDialog(null, "Name is empty !", "Error", JOptionPane.WARNING_MESSAGE);
			return;
		}

		ArrayList<ArrayList<String>> foundPatients = null;
		try {
			foundPatients = Select.searchPatientByName(patientName);
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
		}
		if (foundPatients != null) {
			int noOfRows = foundPatients.size();
			int noOfColumns = foundPatients.get(0).size();
			int iRow;
			int iColumn;

			DefaultTableModel resultTableModel = (DefaultTableModel) resultTable.getModel();
			resultTableModel.setRowCount(0);
			resultTableModel.setColumnCount(noOfColumns);
			String columnNames[] = { "Patient ID", "Name", "Gender", "Date of Birth", "address", "contact No" };
			resultTableModel.setColumnIdentifiers(columnNames);

			// get no of rows and columns in foundPatients
			for (iRow = 0; iRow < noOfRows; iRow++) {
				Object[] columnValue = new Object[noOfColumns];
				for (iColumn = 0; iColumn < noOfColumns; iColumn++) {
					columnValue[iColumn] = foundPatients.get(iRow).get(iColumn);
				}
				resultTableModel.addRow(columnValue);
			}

			searchResultPanel.setVisible(true);
		}
	}

	private void searchUsingIdButtonActionPerformed(ActionEvent evt) {

		int patientId;
		if (patientIdSearchTextField.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Patient ID cannot be left empty!", "Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		try {
			patientId = parseInt(patientIdSearchTextField.getText());
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Patient ID must be a number ! ", "Error", JOptionPane.WARNING_MESSAGE);
			return;
		}

		ArrayList<String> foundPatient = null;
		try {
			foundPatient = Select.searchPatientById(patientId);
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
		}

		// found patient and insert in table
		if (foundPatient != null) {
			int noOfColumns = foundPatient.size();
			int iColumn;

			DefaultTableModel resultTableModel = (DefaultTableModel) resultTable.getModel();
			resultTableModel.setRowCount(0);
			resultTableModel.setColumnCount(noOfColumns);
			String columnNames[] = { "Patient ID", "Name", "Gender", "Date of Birth", "address", "contact No" };
			resultTableModel.setColumnIdentifiers(columnNames);

			//  obtineti randuri si coloane in foundPatients
			Object[] columnValue = new Object[noOfColumns];
			for (iColumn = 0; iColumn < noOfColumns; iColumn++) {
				columnValue[iColumn] = foundPatient.get(iColumn);
			}
			resultTableModel.addRow(columnValue);
			searchResultPanel.setVisible(true);
		}

	}

	private void searchResultPanelComponentShown(ComponentEvent evt) {

	}

	private void displayAllButtonActionPerformed(ActionEvent evt) {
		ArrayList<ArrayList<String>> foundPatients = null;
		try {
			foundPatients = Select.displayAll();
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
		}
		if (foundPatients != null) {
			int noOfRows = foundPatients.size();
			int noOfColumns = foundPatients.get(0).size();
			int iRow;
			int iColumn;

			DefaultTableModel resultTableModel = (DefaultTableModel) resultTable.getModel();
			resultTableModel.setRowCount(0);
			resultTableModel.setColumnCount(noOfColumns);
			String columnNames[] = { "Patient ID", "Name", "Gender", "Date of Birth", "address", "contact No" };
			resultTableModel.setColumnIdentifiers(columnNames);

			// get no of rows and columns in foundPatients
			for (iRow = 0; iRow < noOfRows; iRow++) {
				Object[] columnValue = new Object[noOfColumns];
				for (iColumn = 0; iColumn < noOfColumns; iColumn++) {
					columnValue[iColumn] = foundPatients.get(iRow).get(iColumn);
				}
				resultTableModel.addRow(columnValue);
			}

			searchResultPanel.setVisible(true);
		}

	}

}
