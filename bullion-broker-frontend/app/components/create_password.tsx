export default function CreatePassword() {
  return (
    <section className="w-full md:w-2/5 flex items-center justify-center px-6">
      <div className="w-full max-w-md bg-slate-900/90 backdrop-blur border border-slate-800 rounded-xl p-8 shadow-2xl">
        <h2 className="text-2xl font-semibold mb-6 text-center">
          Create Password
        </h2>

        <form className="space-y-4">
          <div>
            <label className="block text-sm mb-1 text-slate-400">
              Create Password
            </label>
            <input
              type="password"
              placeholder="Create password"
              className="w-full px-4 py-2 rounded-md bg-slate-950 border border-slate-800 focus:outline-none focus:ring-2 focus:ring-amber-400"
            />
          </div>

          <div>
            <label className="block text-sm mb-1 text-slate-400">
              Confirm Password
            </label>
            <input
              type="password"
              placeholder="Confirm password"
              className="w-full px-4 py-2 mb-2 rounded-md bg-slate-950 border border-slate-800 focus:outline-none focus:ring-2 focus:ring-amber-400"
            />
          </div>

          <div>
            <button
              type="button"
              className="w-full bg-amber-400 text-slate-950 font-semibold py-2 rounded-md hover:bg-amber-300 transition"
            >
              Register User
            </button>
          </div>
        </form>
      </div>
    </section>
  );
}
