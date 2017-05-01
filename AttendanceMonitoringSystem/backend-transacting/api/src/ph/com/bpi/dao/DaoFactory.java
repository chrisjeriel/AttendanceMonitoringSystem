package ph.com.bpi.dao;

import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ph.com.bpi.dao.impl.*;

@Repository
@Transactional
public class DaoFactory{
	@Autowired
	private static SessionFactory		sessionFactory		= null;
	private static ApplicationContext	context				= null;
	private static Logger				logger				= Logger.getLogger(DaoFactory.class.getName());
	private static final String			APP_CONTEXT_PATH	= "/META-INF/spring/app-context.xml";

	static{
		initContext();
	}

	/**
	 * Init context.
	 */
	private static void initContext(){
		logger.info("Initializing context!");
		context = getApplicationContext();
	}

	/**
	 * Returns ApplicationContext.
	 * 
	 * @return
	 */
	private static ApplicationContext getApplicationContext(){
		if(context == null){
			context = new ClassPathXmlApplicationContext(APP_CONTEXT_PATH);
		}

		return context;
	}

	@Autowired
	public void setSessionFactory(SessionFactory aSessionFactory){
		sessionFactory = aSessionFactory;
	}

	public static T0001DAO getT0001DAO(){
		T0001DAO dao = new T0001DAOImpl(sessionFactory);
		return dao;
	}

	public static HeaderDataDAO getHeaderDataDAO(){
		HeaderDataDAO dao = new HeaderDataDAOImpl(sessionFactory);
		return dao;
	}
	public static T0112DAO getT0012DAO(){
		T0112DAO dao = new T0112DAOImpl(sessionFactory);
		return dao;
	}
	

	public static T0225DAO getT0225DAO(){
		T0225DAO dao = new T0225DAOImpl(sessionFactory);
		return dao;
	}

	public static T0200DAO getT0200DAO(){
		T0200DAO dao = new T0200DAOImpl(sessionFactory);
		return dao;
	}
	
	public static T0220DAO getT0220DAO(){
		T0220DAO dao = new T0220DAOImpl(sessionFactory);
		return dao;
	}
	
		public static T0010DAO getT0010DAO(){
		T0010DAO dao = new T0010DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0011DAO getT0011DAO(){
		T0011DAO dao = new T0011DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0100DAO getT0100DAO(){
		T0100DAO dao = new T0100DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0102DAO getT0102DAO(){
		T0102DAO dao = new T0102DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0104DAO getT0104DAO(){
		T0104DAO dao = new T0104DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0105DAO getT0105DAO(){
		T0105DAO dao = new T0105DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0107DAO getT0107DAO(){
		T0107DAO dao = new T0107DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0109DAO getT0109DAO(){
		T0109DAO dao = new T0109DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0110DAO getT0110DAO(){
		T0110DAO dao = new T0110DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0112DAO getT0112DAO(){
		T0112DAO dao = new T0112DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0114DAO getT0114DAO(){
		T0114DAO dao = new T0114DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0115DAO getT0115DAO(){
		T0115DAO dao = new T0115DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0117DAO getT0117DAO(){
		T0117DAO dao = new T0117DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0118DAO getT0118DAO(){
		T0118DAO dao = new T0118DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0120DAO getT0120DAO(){
		T0120DAO dao = new T0120DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0123DAO getT0123DAO(){
		T0123DAO dao = new T0123DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0125DAO getT0125DAO(){
		T0125DAO dao = new T0125DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0127DAO getT0127DAO(){
		T0127DAO dao = new T0127DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0128DAO getT0128DAO(){
		T0128DAO dao = new T0128DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0130DAO getT0130DAO(){
		T0130DAO dao = new T0130DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0131DAO getT0131DAO(){
		T0131DAO dao = new T0131DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0133DAO getT0133DAO(){
		T0133DAO dao = new T0133DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0134DAO getT0134DAO(){
		T0134DAO dao = new T0134DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0136DAO getT0136DAO(){
		T0136DAO dao = new T0136DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0140DAO getT0140DAO(){
		T0140DAO dao = new T0140DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0142DAO getT0142DAO(){
		T0142DAO dao = new T0142DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0144DAO getT0144DAO(){
		T0144DAO dao = new T0144DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0146DAO getT0146DAO(){
		T0146DAO dao = new T0146DAOImpl(sessionFactory);
		return dao;
		}
	
	
	
		public static T0201DAO getT0201DAO(){
		T0201DAO dao = new T0201DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0204DAO getT0204DAO(){
		T0204DAO dao = new T0204DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0205DAO getT0205DAO(){
		T0205DAO dao = new T0205DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0206DAO getT0206DAO(){
		T0206DAO dao = new T0206DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0207DAO getT0207DAO(){
		T0207DAO dao = new T0207DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0208DAO getT0208DAO(){
		T0208DAO dao = new T0208DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0210DAO getT0210DAO(){
		T0210DAO dao = new T0210DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0211DAO getT0211DAO(){
		T0211DAO dao = new T0211DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0212DAO getT0212DAO(){
		T0212DAO dao = new T0212DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0213DAO getT0213DAO(){
		T0213DAO dao = new T0213DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0214DAO getT0214DAO(){
		T0214DAO dao = new T0214DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0216DAO getT0216DAO(){
		T0216DAO dao = new T0216DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0218DAO getT0218DAO(){
		T0218DAO dao = new T0218DAOImpl(sessionFactory);
		return dao;
		}
	
	
	
		public static T0222DAO getT0222DAO(){
		T0222DAO dao = new T0222DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0224DAO getT0224DAO(){
		T0224DAO dao = new T0224DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0226DAO getT0226DAO(){
		T0226DAO dao = new T0226DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0227DAO getT0227DAO(){
		T0227DAO dao = new T0227DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0229DAO getT0229DAO(){
		T0229DAO dao = new T0229DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0230DAO getT0230DAO(){
		T0230DAO dao = new T0230DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0232DAO getT0232DAO(){
		T0232DAO dao = new T0232DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0234DAO getT0234DAO(){
		T0234DAO dao = new T0234DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0235DAO getT0235DAO(){
		T0235DAO dao = new T0235DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0300DAO getT0300DAO(){
		T0300DAO dao = new T0300DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0301DAO getT0301DAO(){
		T0301DAO dao = new T0301DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0302DAO getT0302DAO(){
		T0302DAO dao = new T0302DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0303DAO getT0303DAO(){
		T0303DAO dao = new T0303DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0304DAO getT0304DAO(){
		T0304DAO dao = new T0304DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0305DAO getT0305DAO(){
		T0305DAO dao = new T0305DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0306DAO getT0306DAO(){
		T0306DAO dao = new T0306DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0307DAO getT0307DAO(){
		T0307DAO dao = new T0307DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0309_ADAO getT0309_ADAO(){
		T0309_ADAO dao = new T0309_ADAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0309_BDAO getT0309_BDAO(){
		T0309_BDAO dao = new T0309_BDAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0310DAO getT0310DAO(){
		T0310DAO dao = new T0310DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0311DAO getT0311DAO(){
		T0311DAO dao = new T0311DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0312DAO getT0312DAO(){
		T0312DAO dao = new T0312DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0314DAO getT0314DAO(){
		T0314DAO dao = new T0314DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0315DAO getT0315DAO(){
		T0315DAO dao = new T0315DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0316DAO getT0316DAO(){
		T0316DAO dao = new T0316DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0317DAO getT0317DAO(){
		T0317DAO dao = new T0317DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0318DAO getT0318DAO(){
		T0318DAO dao = new T0318DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0319DAO getT0319DAO(){
		T0319DAO dao = new T0319DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0320DAO getT0320DAO(){
		T0320DAO dao = new T0320DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0323DAO getT0323DAO(){
		T0323DAO dao = new T0323DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0324DAO getT0324DAO(){
		T0324DAO dao = new T0324DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0325DAO getT0325DAO(){
		T0325DAO dao = new T0325DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0326DAO getT0326DAO(){
		T0326DAO dao = new T0326DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0327DAO getT0327DAO(){
		T0327DAO dao = new T0327DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0333DAO getT0333DAO(){
		T0333DAO dao = new T0333DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0334DAO getT0334DAO(){
		T0334DAO dao = new T0334DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0400DAO getT0400DAO(){
		T0400DAO dao = new T0400DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0500DAO getT0500DAO(){
		T0500DAO dao = new T0500DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0501DAO getT0501DAO(){
		T0501DAO dao = new T0501DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0502DAO getT0502DAO(){
		T0502DAO dao = new T0502DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0600_01DAO getT0600_01DAO(){
		T0600_01DAO dao = new T0600_01DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0600_2DAO getT0600_2DAO(){
		T0600_2DAO dao = new T0600_2DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0600_3DAO getT0600_3DAO(){
		T0600_3DAO dao = new T0600_3DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0600_4DAO getT0600_4DAO(){
		T0600_4DAO dao = new T0600_4DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0604DAO getT0604DAO(){
		T0604DAO dao = new T0604DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0803DAO getT0803DAO(){
		T0803DAO dao = new T0803DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0804DAO getT0804DAO(){
		T0804DAO dao = new T0804DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0811DAO getT0811DAO(){
		T0811DAO dao = new T0811DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0812DAO getT0812DAO(){
		T0812DAO dao = new T0812DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0814DAO getT0814DAO(){
		T0814DAO dao = new T0814DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0815DAO getT0815DAO(){
		T0815DAO dao = new T0815DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0816DAO getT0816DAO(){
		T0816DAO dao = new T0816DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0817DAO getT0817DAO(){
		T0817DAO dao = new T0817DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0900DAO getT0900DAO(){
		T0900DAO dao = new T0900DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0901DAO getT0901DAO(){
		T0901DAO dao = new T0901DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0902DAO getT0902DAO(){
		T0902DAO dao = new T0902DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0903DAO getT0903DAO(){
		T0903DAO dao = new T0903DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0904DAO getT0904DAO(){
		T0904DAO dao = new T0904DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0905DAO getT0905DAO(){
		T0905DAO dao = new T0905DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0906DAO getT0906DAO(){
		T0906DAO dao = new T0906DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0907DAO getT0907DAO(){
		T0907DAO dao = new T0907DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0908DAO getT0908DAO(){
		T0908DAO dao = new T0908DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0909DAO getT0909DAO(){
		T0909DAO dao = new T0909DAOImpl(sessionFactory);
		return dao;
		}
	
	
		public static T0910DAO getT0910DAO(){
		T0910DAO dao = new T0910DAOImpl(sessionFactory);
		return dao;
		}
	
	
	public static T0121DAO getT0121DAO(){
		T0121DAO dao = new T0121DAOImpl(sessionFactory);
		return dao;
	}
}
