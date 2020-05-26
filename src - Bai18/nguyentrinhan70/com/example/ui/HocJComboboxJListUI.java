package nguyentrinhan70.com.example.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class HocJComboboxJListUI extends JFrame {

	JComboBox cboSo;
	JList listSo;
	JButton btnOK;
	public HocJComboboxJListUI() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
	}

	public HocJComboboxJListUI(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public HocJComboboxJListUI(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
 
	public HocJComboboxJListUI(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
		addControls();
		addEvents();
	}
	
	public void addControls() {
		Container con = getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		JPanel pnCombo = new JPanel();
		pnCombo.setLayout(new FlowLayout());
		JLabel lblChonSo = new JLabel("Chọn số");
		pnCombo.add(lblChonSo);
		
		cboSo = new JComboBox();
		
		Random rd = new Random();
		for(int i=0; i<=100; i++){
			int x = rd.nextInt(500);
			cboSo.addItem(x +"");
		}
				
		pnCombo.add(cboSo);
		con.add(pnCombo);
		
		JPanel pnList = new JPanel();
		pnList.setLayout(new FlowLayout());
		JLabel lblSo2 = new JLabel("Chọn số: ");
		listSo = new JList();
		
		Vector <Integer>vec = new Vector();
		for(int i = 0; i<=100; i++){
			int x = rd.nextInt(500);
			vec.add(x);
		}
		listSo.setListData(vec);
		pnList.add(lblSo2);
		
		
		JScrollPane scList = new JScrollPane(listSo,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnList.add(scList);
		con.add(pnList);
	
		JPanel pnOk = new JPanel();
		pnOk.setLayout(new FlowLayout());
		btnOK = new JButton("OK");
		pnOk.add(btnOK);
		con.add(pnOk);
	} 
	public void addEvents () {
		cboSo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int vt = cboSo.getSelectedIndex();
				if(vt!=-1){
					JOptionPane.showMessageDialog(null, "Vị trí chọn= "+vt +" giá trị" +toString()
					+ cboSo.getSelectedItem());
				}
			}
		});
	
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyXemGiaTriCuaList();
		
			}
		});
		
	}
	protected void xuLyXemGiaTriCuaList() {
		// TODO Auto-generated method stub
		Object obj = listSo.getSelectedValue();
		int vt = listSo.getSelectedIndex();
		JOptionPane.showConfirmDialog(null, "List:  vị trí chọn = "+vt +
				" Giá trị: "+ obj);
		
	}

	public void showWindow() {
		this.setSize(250, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}


}
