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
	private	JScrollPane ts = new JScrollPane(ta); //채팅내용이 많을 경우를 대비한 JScrollPane에 JTextArea변수인 ta추가
	private	JTextField tf = new JTextField(); //채팅창에 입력할 글을 입력하는 Field
	private JButton star = new JButton(new ImageIcon(this.getClass().getClassLoader().getResource("변환.png")));
	private JButton duplicate1 = new JButton(new ImageIcon(this.getClass().getClassLoader().getResource("중복검사1.png")));
	private JButton duplicate2 = new JButton(new ImageIcon(this.getClass().getClassLoader().getResource("중복검사2.png")));
	private JButton text = new JButton(new ImageIcon(this.getClass().getClassLoader().getResource("text.png")));
	public MainFrame() {
		setTitle("Program for GwangMoon Made by JunSeong");
		Container c = this.getContentPane(); //추가
		setLocation(new Point(200,200)); //윈도우상의 창의 위치를 잡아준다.
		setPreferredSize(new Dimension(800, 700));//프레임의 창의크기 설정
		setResizable(false); //창 크기 고정
		pack();//컴포넌트 크기만큼 창의 크기를 잡아준다.
		setLocationRelativeTo(null); //(null)을 넣음으로써 화면중앙에 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임창을 닫을경우 프로세스를 종료
		setVisible(true); //프레임을 보여준다.
		setLayout(null); //레이아웃 없음
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

	class ClickEvent implements ActionListener{ //게임종료시 Yes나No버튼을 눌렀을 시 이벤트
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(star)){ //Yes버튼을 눌렀을 경우
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
						ta.append(name[i]+"2~4글자 한글 이름만 가능해요 ㅠ\n");
				}
			}
			if(e.getSource().equals(duplicate1)){ 
				String [] name = tf.getText().toString().split(" ");
				Map<String, Integer> m = new HashMap<>();
				boolean d = false;
				for(int i=0; i<name.length; i++) {
					if(name[i].length()==2) {
						if(m.containsKey(name[i].substring(1,2))) {
							ta.append(name[i]+" 다른 학생과 (성제외)이름이 중복됩니다.\n");
							d = true;
						}
						else
							m.put(name[i].substring(1,2), 1);
					}
					else if(name[i].length()==3) {
						if(m.containsKey(name[i].substring(1,3))) {
							ta.append(name[i]+" 다른 학생과 (성제외)이름이 중복됩니다.\n");
							d = true;
						}

						else
							m.put(name[i].substring(1,3), 1);
					}
					else if(name[i].length()==4) {
						if(m.containsKey(name[i].substring(2,4))) {
							ta.append(name[i]+" 다른 학생과 (성제외)이름이 중복됩니다.\n");
							d = true;
						}
						else
							m.put(name[i].substring(2,4), 1);
					}
					else
						ta.append(name[i]+" 2~4글자 한글 이름만 가능해요 ㅠ\n");
				}
				if(!d)
					ta.append("중복되는 이름이 없습니다!\n");
			}
			if(e.getSource().equals(duplicate2)){ 
				String [] name = tf.getText().toString().split(" ");
				Map<String, Integer> m = new HashMap<>();
				boolean d = false;
				for(int i=0; i<name.length; i++) {
					if(m.containsKey(name[i])) {
						System.out.println(name[i]+" 다른 학생과 (성포함)이름이 중복됩니다.\n");
						d=true;
					}
					else
						m.put(name[i], 1);
				}
				ta.append("중복되는 이름이 없습니다!\n");
			}
			tf.setText("");
		}
	}
	//마우스 커서 이벤트
	class MouseCursorEvent extends MouseAdapter {

		@Override 
		public void mouseEntered(MouseEvent e) { // 마우스를 버튼 위에 올렸을 때 
			setCursor(new Cursor(Cursor.HAND_CURSOR));// 커서를 손가락모양 으로 변경
		}

		@Override 
		public void mouseExited(MouseEvent e) { // 마우스를 버튼에서 올리지 않았을 때 
			setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // 커서를 디폴트값으로 변경
		}

	}
}