/**
 * Copyright 2009-18 Simon Andrews
 *
 *    This file is part of SeqMonk.
 *
 *    SeqMonk is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    SeqMonk is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with SeqMonk; if not, write to the Free Software
 *    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package uk.ac.babraham.SeqMonk.Filters;

/**
 * The listener interface for receiving options events.
 * The class that is interested in processing an options
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addOptionsListener<code> method. When
 * the options event occurs, that object's appropriate
 * method is invoked.
 * 
 * @see OptionsEvent
 */
public interface OptionsListener {

	/**
	 * Options changed.
	 */
	public void optionsChanged();
}
