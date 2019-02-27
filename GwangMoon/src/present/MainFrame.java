package present;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MainFrame extends JFrame {
	private	JTextArea ta = new JTextArea();
	private	JScrollPane ts = new JScrollPane(ta); //ä�ó����� ���� ��츦 ����� JScrollPane�� JTextArea������ ta�߰�
	private	JTextField tf = new JTextField(); //ä��â�� �Է��� ���� �Է��ϴ� Field
	private JButton star = new JButton(new ImageIcon(this.getClass().getClassLoader().getResource("��ȯ.png")));
	private JButton duplicate1 = new JButton(new ImageIcon(this.getClass().getClassLoader().getResource("�ߺ��˻�1.png")));
	private JButton duplicate2 = new JButton(new ImageIcon(this.getClass().getClassLoader().getResource("�ߺ��˻�2.png")));
	private JButton text = new JButton(new ImageIcon(this.getClass().getClassLoader().getResource("text.png")));
	public MainFrame() {
		setTitle("Program for GwangMoon Made by JunSeong");
		Container c = this.getContentPane(); //�߰�
		setLocation(new Point(200,200)); //��������� â�� ��ġ�� ����ش�.
		setPreferredSize(new Dimension(800, 700));//�������� â��ũ�� ����
		setResizable(false); //â ũ�� ����
		pack();//������Ʈ ũ�⸸ŭ â�� ũ�⸦ ����ش�.
		setLocationRelativeTo(null); //(null)�� �������ν� ȭ���߾ӿ� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������â�� ������� ���μ����� ����
		setVisible(true); //�������� �����ش�.
		setLayout(null); //���̾ƿ� ����
		tf.setFont(new Font("Dialog", Font.BOLD, 20));
		ta.setFont(new Font("Dialog", Font.BOLD, 20));
		c.setBackground(Color.BLACK);
		add(ts);
		add(tf);
		add(star);
		add(duplicate1);
		add(duplicate2);
		add(text);

		ts.setBounds(0, 0, 800, 400);
		tf.setBounds(0, 455, 700,245);
		tf.setBackground(Color.LIGHT_GRAY);
		star.setBounds(705, 455, 87, 65);
		duplicate1.setBounds(705, 525, 87, 65);
		duplicate2.setBounds(705, 595, 87, 65);
		text.setBounds(0,403, 795, 50);
		star.addActionListener(new ClickEvent());
		duplicate1.addActionListener(new ClickEvent());
		duplicate2.addActionListener(new ClickEvent());
		star.addMouseListener(new MouseCursorEvent());
		duplicate1.addMouseListener(new MouseCursorEvent());
		duplicate2.addMouseListener(new MouseCursorEvent());
		text.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			}

		});

	}

	class ClickEvent implements ActionListener{ //��������� Yes��No��ư�� ������ �� �̺�Ʈ
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(star)){ //Yes��ư�� ������ ���
				String s = tf.getText().toString().replaceAll("  ", " ");
				s = s.replaceAll("   ", " ");
				String [] name = s.split(" ");
				for(int i=0; i<name.length; i++) {
					if(name[i].length()==2)
						ta.append(name[i].substring(0,1)+"*\n");
					else if(name[i].length()==3)
						ta.append(name[i].substring(0,1)+"**\n");
					else if(name[i].length()==4)
						ta.append(name[i].substring(0,1)+"***\n");
					else
						ta.append(name[i]+"2~4���� �ѱ� �̸��� �����ؿ� ��\n");
				}
			}
			if(e.getSource().equals(duplicate1)){ 
				String [] name = tf.getText().toString().split(" ");
				Map<String, Integer> m = new HashMap<>();
				boolean d = false;
				for(int i=0; i<name.length; i++) {
					if(name[i].length()==2) {
						if(m.containsKey(name[i].substring(1,2))) {
							ta.append(name[i]+" �ٸ� �л��� (������)�̸��� �ߺ��˴ϴ�.\n");
							d = true;
						}
						else
							m.put(name[i].substring(1,2), 1);
					}
					else if(name[i].length()==3) {
						if(m.containsKey(name[i].substring(1,3))) {
							ta.append(name[i]+" �ٸ� �л��� (������)�̸��� �ߺ��˴ϴ�.\n");
							d = true;
						}

						else
							m.put(name[i].substring(1,3), 1);
					}
					else if(name[i].length()==4) {
						if(m.containsKey(name[i].substring(2,4))) {
							ta.append(name[i]+" �ٸ� �л��� (������)�̸��� �ߺ��˴ϴ�.\n");
							d = true;
						}
						else
							m.put(name[i].substring(2,4), 1);
					}
					else
						ta.append(name[i]+" 2~4���� �ѱ� �̸��� �����ؿ� ��\n");
				}
				if(!d)
					ta.append("�ߺ��Ǵ� �̸��� �����ϴ�!\n");
			}
			if(e.getSource().equals(duplicate2)){ 
				String [] name = tf.getText().toString().split(" ");
				Map<String, Integer> m = new HashMap<>();
				boolean d = false;
				for(int i=0; i<name.length; i++) {
					if(m.containsKey(name[i])) {
						System.out.println(name[i]+" �ٸ� �л��� (������)�̸��� �ߺ��˴ϴ�.\n");
						d=true;
					}
					else
						m.put(name[i], 1);
				}
				ta.append("�ߺ��Ǵ� �̸��� �����ϴ�!\n");
			}
			tf.setText("");
		}
	}
	//���콺 Ŀ�� �̺�Ʈ
	class MouseCursorEvent extends MouseAdapter {

		@Override 
		public void mouseEntered(MouseEvent e) { // ���콺�� ��ư ���� �÷��� �� 
			setCursor(new Cursor(Cursor.HAND_CURSOR));// Ŀ���� �հ������ ���� ����
		}

		@Override 
		public void mouseExited(MouseEvent e) { // ���콺�� ��ư���� �ø��� �ʾ��� �� 
			setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Ŀ���� ����Ʈ������ ����
		}

	}
}