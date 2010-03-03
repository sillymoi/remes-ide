/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

// A representation for a range in a document where a keyword (i.e.,
// a static string) is expected.
public class RemessrcExpectedCsString extends hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcAbstractExpectedElement {
	
	private String value;
	
	public RemessrcExpectedCsString(org.eclipse.emf.ecore.EClass ruleMetaclass, java.lang.String value) {
		super(ruleMetaclass);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getTokenName() {
		return "'" + value + "'";
	}
	
	public String toString() {
		return "CsString \"" + value + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof RemessrcExpectedCsString) {
			return this.value.equals(((RemessrcExpectedCsString) o).value);
		}
		return false;
	}
	
}
