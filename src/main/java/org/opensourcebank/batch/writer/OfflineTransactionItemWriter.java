package org.opensourcebank.batch.writer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.opensourcebank.transaction.iso8583.AbstractIso8583Transaction;
import org.opensourcebank.transaction.iso8583.Iso8583Transaction;
import org.opensourcebank.transaction.iso8583.TransactionStatus;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Dummy {@link org.springframework.batch.item.ItemWriter} which only logs data it receives.
 */
public class OfflineTransactionItemWriter implements ItemWriter<Iso8583Transaction> {

	private static final Log log = LogFactory.getLog( OfflineTransactionItemWriter.class );

	public void write( List<? extends Iso8583Transaction> transactions ) throws Exception {
        
        for( Iso8583Transaction tx: transactions ) {

            ( (AbstractIso8583Transaction) tx ).setStatus( TransactionStatus.IN_PROGRESS );

            // do some business heavy lifting...
            Thread.sleep( 2000 );

            ( (AbstractIso8583Transaction) tx ).setStatus( TransactionStatus.COMPLETED );

            //log.info("\t\n" + tx + "\n");
            System.out.println( "\t\n" + tx + "\n" );
        }
	}

}