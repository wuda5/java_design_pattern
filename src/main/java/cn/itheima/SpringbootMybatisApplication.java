package cn.itheima;

import com.lou.simhasher.SimHasher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
		System.out.println(9999);
		System.out.println(9999);
		System.out.println(9999);
		SimHasher hash1 = new SimHasher("haha");//自己打包jar原来是这么回事

	}

}
