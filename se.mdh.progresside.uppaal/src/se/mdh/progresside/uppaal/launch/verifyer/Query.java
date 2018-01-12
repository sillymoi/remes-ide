package se.mdh.progresside.uppaal.launch.verifyer;

public class Query {
	private String query;
	private String comment;

	public Query(String query, String comment) {
		this.query = query;
		this.comment = comment;
	}
	
	public void setQuery(String query) {
		this.query = query;
	}
	public String getQuery() {
		return query;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getComment() {
		return comment;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((query == null) ? 0 : query.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Query other = (Query) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (query == null) {
			if (other.query != null)
				return false;
		} else if (!query.equals(other.query))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return query;
	}
}
