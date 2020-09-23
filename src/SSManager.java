
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SSManager extends JFrame implements ActionListener {
    // single static GUI instance. singletone pattern.
	private static SSManager ourInstance = new SSManager();

	private JPanel mainPanel;
	private JTextField productName;
	private JTextField productQTY;
	private JTextField productPrice;
	private JTextArea console;

	public static SSManager getInstance() {
		return ourInstance;
	}

	private SSManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblNewLabel = new JLabel("Product Name");
		panel.add(lblNewLabel);

		productName = new JTextField();
		panel.add(productName);
		productName.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Product Quantity");
		panel.add(lblNewLabel_1);

		productQTY = new JTextField();
		panel.add(productQTY);
		productQTY.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Product Price");
		panel.add(lblNewLabel_2);

		productPrice = new JTextField();
		panel.add(productPrice);
		productPrice.setColumns(10);

		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.EAST);
		panel_1.setPreferredSize(new Dimension(300,200));
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{343, 0};
		gbl_panel_1.rowHeights = new int[]{201, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
				console = new JTextArea();
				console.setEditable(false);
				GridBagConstraints gbc_console = new GridBagConstraints();
				gbc_console.fill = GridBagConstraints.BOTH;
				gbc_console.gridx = 0;
				gbc_console.gridy = 0;
				panel_1.add(console, gbc_console);

		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(5, 0, 0, 0));

		JButton btnGold = new JButton("add");
                
		btnGold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SSManager.getInstance().updateConsole("it works !!!");
                                 File fm =new File("output.txt");
                                // String s=productName.getText();
                                // double pr=Double.parseDouble(productQTY.getText());
                                 //double a=Double.parseDouble(productPrice.getText());
                              //productname p1=new productname(s,pr,a)  ;
                              productname[] p=new productname[100]  ;
                              
                              double sum=0;
                              try{
                                  FileWriter fw =new FileWriter(fm,true);
                              for(int i =0;i<1;i++){
                                  
                                  String s=productName.getText();
                                 double pr=Double.parseDouble(productQTY.getText());
                                 double a=Double.parseDouble(productPrice.getText());
                                   p[i]=new productname(s,pr,a)  ;
                              
        
        sum=p[i].sum();
        
                      
                      
                       
                        fw.write(p[i].getS());
                        
                        }
                              fw.close();
                              }
                        catch (Exception ex){
                            
                        }
                        
                                
			
                         SSManager.getInstance().updateConsole(String.valueOf(sum));  
                        
                        
                        
                }
                        
                        
                        });
		panel_2.add(btnGold);

		JButton btnSilver = new JButton("Silver");
		btnSilver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                     SSManager.getInstance().updateConsole("it works !!!");
			}
		});
		panel_2.add(btnSilver);

		JButton btnAddProduct = new JButton("Add Product");
		btnAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
SSManager.getInstance().updateConsole("it works !!!");
			}
		});
		panel_2.add(btnAddProduct);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		panel_2.add(btnCalculate);

		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		panel_2.add(btnPrint);
	}

	public void initView() {
		setSize(500, 400);
		setTitle("SuperShop Manager");
		mainPanel = new JPanel(new GridLayout(8, 3));
		getContentPane().add(mainPanel);

		show();
	}

	public void updateConsole(String str) {
		console.append(str + "\n");
	}

	public String getConsoleData() {
		return console.getText().toString();
	}

    /**
     *
     * @return
     */
    public String getData()
        {
            return console.getText().toString();
        }

	@Override
	public void actionPerformed(ActionEvent e) {

	}

    //@Override
    //public void actionPerformed(ActionEvent e) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
}

    

