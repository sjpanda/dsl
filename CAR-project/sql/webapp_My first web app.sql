create table team (
		
			gid BIGINT
			,
			name VARCHAR
			 
				(255) 
			,
			budget DECIMAL
			 
				(7, 2) , primary key (gid)) charset=UTF8;	

		create table contact (
		
			id INTEGER
			 
				(10) 
			 
				zerofill 
			 
				not null 
			,
			firstname VARCHAR
			 
				(255) 
			,
			lastname VARCHAR
			 
				(255) 
			,
			age INTEGER
			,
			email VARCHAR
			 
				(255) 
			,
			groupid BIGINT
			, primary key (id)
					, foreign key (groupid) references team (gid)) charset=UTF8;
		
				
		
		