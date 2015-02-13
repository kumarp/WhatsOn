package org.example.app.domain;

public class Movie {

	private Long id;
	private String title;
	private String servicesAvailable;

	public Movie() {
		super();
	}

	public Movie(Long id, String title, String servicesAvailable) {
		super();
		this.id = id;
		this.title = title;
		this.servicesAvailable = servicesAvailable;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getServicesAvailable() {
		return servicesAvailable;
	}

	public void setServicesAvailable(String servicesAvailable) {
		this.servicesAvailable = servicesAvailable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime
				* result
				+ ((servicesAvailable == null) ? 0 : servicesAvailable
						.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Movie other = (Movie) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (servicesAvailable == null) {
			if (other.servicesAvailable != null)
				return false;
		} else if (!servicesAvailable.equals(other.servicesAvailable))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", servicesAvailable="
				+ servicesAvailable + "]";
	}

}
